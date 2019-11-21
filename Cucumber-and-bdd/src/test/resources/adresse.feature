Feature: Modifier l'adresse d'un abonné  
  
  Scenario Outline: Modification de l adresse d un abonné residant en France sans ou avec date d effet
    Given un abonne avec une adresse principale <Active> en <Pays>
    When le conseiller connecté à <Canal> modifie l adresse de l abonné <Condition>
    Then  l adresse de l abonné modifiée est enregistrée sur l'ensemble des contrats de l abonné
    And un mouvement de modification d adresse est créé
    Examples: 
    | Canal | Active   | Pays    | ondition         |
    | FACE  | inactive | France  | sans date d’effet |
    | EC    | active   | Pologne | avec date d’effet |

    
