# Projet_DevOps_BOUYSSOU_Lucas
Bonne année ! Il ne faut pas faire de projet aussi compliqué. 

Un projet complexe des trois applications (Ansible Terraform et Jenkins)

Voila c'est l'essentiel ! :)

Le but de Jenkins est de créer un .Jar d'une application java sb3t.
Comme vu en cours pour utiliser Jenkins nous avons besoin de Docker pour créer notre pipeline afin de pouvoir effectuer nos tests unitaires.
Pour les éffectuer il faut aller sur notre localhost port 80  afin de pouvoir lancer nos test sur notre pipeline (pour ma part nommé devops).

Pour verifier la dernière étape ou il faut renommé le fichier jar en Snapshot -> il faut aller sur notre test et dans workspace on peut vérifier le nom du fichier.


Pour terraform j'ai ajouter un dossier ssh avec ma clé public que j'ai rajouté dans mon add-ssh-web et ma clé privé.
J'ai aussi ajouté un fichier credentials avec les aws_access_key_id = AKIA5HPHYM2IHU57ZD7Q
aws_secret_access_key = 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
lorsque je lance mes tests, erreur unauthorized accès je ne trouve pas la source du problème.

Pour ansible j'ai lancé mon docker compose. je lance mes tests mais erreur.
PLAY [Java] ************************************************************************************************************
skipping: no hosts matched

PLAY RECAP *************

AWS instance Ynov down.  probablement la connexion SSH qui n'aboutie pas avec mon compte deploy comme pour terraform.





Pour Résumer:  Projet trop complexe lorsque meme pendant les cours les erreurs étaient corrigées par vous  sans avoir d'explication du pourquoi elles arrivaient .

Bonne correction !