# Test_Without_POM-_in_TestNG

POM :Page Object Model Framework ou Page Object Model Design Pattern.
quelques avantages de l’utilisation du modèle objet de page qui met en évidence son efficacité :

- Rend le code maintenable - Étant donné que les classes de test sont distinctes des classes contenant les éléments Web et de leur fonctionnement,
                           la mise à jour du code est très  facile si un élément Web est mis à jour ou ajouté un nouveau.
- Rend le code lisible- L’utilisateur peut facilement lire le projet et les scripts de test grâce à une ligne fine entre les classes de test et
                            les différentes pages Web.
- rend le code réutilisable- Si plusieurs scripts de test utilisent les mêmes éléments Web, nous n’avons pas besoin d’écrire du code pour gérer
								l’élément Web dans chaque script de test. Le placer dans une classe de page distincte le rend réutilisable en le 
								rendant accessible par n’importe quel script de test.
Considérons un cas de Test simple :
  - Tout d’abord, accédez au Site de démonstration.
  - Deuxièmement, connectez-vous au magasin.
  - Troisièmement, capturez le titre du tableau de bord.
  - Enfin, déconnectez-vous du magasin.
