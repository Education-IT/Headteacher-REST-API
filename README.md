
![banner](https://raw.githubusercontent.com/Education-IT/Headteacher-API/main/images/banner%20(1).png)
## Projekt zaliczeniowy na przedmiot - *Pracownia Programowania* - **UAM**

> **Zrealizowano w trzecim semestrze studiów informatycznych.**

Zadanie polegało na stworzeniu za pomocą języka obiektowego backend'u strony internetowej - a dokładniej REST API - które będzie umożliwiało wykonywanie działań na serwerze takich jak np.: dodanie/usunięcie nauczyciela/ucznia/klasy czy zwrócenie informacji na zadane pytanie takie jak np.: wypisanie uczniów należących do klasy x czy nauczycieli którzy uczą w szkole. Wymiana danych odbywa się za pomocą JSONa. 

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white) ![Groovy](https://img.shields.io/badge/Apache%20Groovy-4298B8.svg?style=for-the-badge&logo=Apache-Groovy&logoColor=white)  ![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white) ![MySql](https://img.shields.io/badge/MySQL-4479A1.svg?style=for-the-badge&logo=MySQL&logoColor=white) ![Swagger](https://img.shields.io/badge/Swagger-85EA2D.svg?style=for-the-badge&logo=Swagger&logoColor=black) ![Postman](https://img.shields.io/badge/Postman-FF6C37.svg?style=for-the-badge&logo=Postman&logoColor=white) ![HTML5](https://img.shields.io/badge/HTML5-E34F26.svg?style=for-the-badge&logo=HTML5&logoColor=white) ![Jetbrains](https://img.shields.io/badge/JetBrains-000000.svg?style=for-the-badge&logo=JetBrains&logoColor=white)[ ![myWebSite](https://img.shields.io/badge/website-000000?style=for-the-badge&logo=About.me&logoColor=white)](https://education-it.pl/)
 ## 
**Program :**
<ul>

<li>Projekt został napisane w Javie (**Framework - Spring boot**)</li>

<li>Aplikacja działa tylko w warstwie back-end'owej - zawiera podstawową warstwę Fron-end'u - przekierowującą do strony z informacjami na temat projektu jak i do strony wspomagającej działanie aplikacji (swagger) </li>

<li>Dla ułatwienia można korzystać w zaimplementowanego w aplikacje **swaggera**</li>

<li>Aplikacja udostępnia **API REST**owe które umożliwia zarządzanie **CRUD** bazą danych</li>

<li>Baza danych (**MySQL**) stacjonuje na tym samym komputerze co aplikacja. Baza danych działa na porcie: 3306</li>
<li>W Bazie danych znajduja się 3 tabele:</li>
<ol>1) Students </ol>
<ol>2) teachers </ol>
<ol>3) SchoolClasses</ol>
<li>Oraz występują poniższe powiązania między nimi:</li>
<ol>1) Teacher - SchoolClass ( powiązanie **oneToOne** )</ol>

<ol>2) SchoolClass - Student ( powiązanie **oneToMany** )</ol>

<li>Testy jednostkowe są napisane w **Junit** jak i frameworku **SPOCK (Groovy)**</li>

<li>Aplikacja pisana w IntellJ IDEA - zebrane **pokrycie kodu testami wynosi 62%**</li>

<li>Use case:</li>

<ol>1) Aplikacja używana przez dyrektora szkoły średniej (jak i administrajce) w celach informacyjnych / statystycznych / planowych / administracyjnych </ol>

<ol>2) Dyrektor/administracja ma możliwość przypisania klasie danego nauczyciela jak i jego zmianę</ol>

<ol>3) Istnieje możliwość wypisania wszystkich studenów należących do danej klasy</ol>

<ol>4) Można stworzyć nowe rekordy w bazie danych w każdej z tabel - nauczyciela , klasy oraz przypisanie klasie jej studentów.</ol>

</ul>
