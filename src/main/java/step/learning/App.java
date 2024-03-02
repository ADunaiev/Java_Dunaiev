package step.learning;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        new Intro().demo();
    }
}

/*
Java - Птатформна (транслююча) мсва 4-го покоління з ООП парадигмою.
- платформа JRE (JVM)
- вихідний код - file.java
- виконавчий (проміжний) код file.class [> java.exe file.class ]
- JDK - інструментарій розробника (компілятор + бібліотеки)
    javac.exe file.java --> file.class
- IDE: Intellij Idea, Netbeans, Eclipse, ...
- бібліотеки коду - lib.jar (аналог DLL)

Сильно прив'язка до файлової системи
- файл з кодом (App.java) повинен називатись так само (реєстрочутливо), як і клас описаний в ньому
(class App)
- файли впорядковуваються у каталоги, назва яких = назва пакету (package). Вимагається щонайменше
подвійна вкладенність (group id) за принципом "інвесного домена", тобто коди фірми, що має сайт (домен)
firm.org, будуть у пакетах org - firm - ...
Є традиції іменування
- types: CapitalCamelCase
- names: lowerCamelCase
- packages: snake_case
- const: PASCAL_CASE (deprecated)


 */
