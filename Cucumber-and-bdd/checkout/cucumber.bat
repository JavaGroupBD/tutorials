echo "------------- build class"
javac -cp "jars/*" step_definitions/CheckoutSteps.java
echo "------------- test cucumber"
java -cp "jars/*" io.cucumber.core.cli.Main -p pretty --snippets camelcase -g step_definitions features
