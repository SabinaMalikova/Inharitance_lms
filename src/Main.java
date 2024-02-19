public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Артем", "разработчиком","Amazon");
        Dancer dancer = new Dancer("Лиса ", "айдолом","BlackPink");
        Singer singer = new Singer("Аса", "певицей", "BabyMonster");


        System.out.println(programmer.getName() +" является "+programmer.getDesignation() +" в компании "+programmer.getCompanyName()+
                ". \n"+ programmer.getName() +" любит читать книги "+ programmer.learn("Лермотова")+
                ". \nОн гулял в парке " +programmer.walk("вчера ")+
                ". \nОчень любит "+programmer.eat("курицу") +
                ". \nРазрабатывает "+programmer.codding("веб приложения. "));

        System.out.println();

        System.out.println(dancer.getName() +" является "+dancer.getDesignation() +" в группе "+dancer.getGroupName()+
                ". \n"+ dancer.getName() +" любит читать книги "+ dancer.learn("Пушкина")+
                ". \nОн гулял в парке " +dancer.walk("сегодня. ")+
                ". \nОчень любит "+dancer.eat("рис.") +
                ". \nРазрабатывает "+dancer.dancing("хип хоп. "));

        System.out.println();

        System.out.println(singer.getName() +" является "+singer.getDesignation() +" в группе "+singer.getBandName()+
                ". \n"+ singer.getName() +" любит читать книги "+ singer.learn("Анны Джейн")+
                ". \nОн гулял в парке " +singer.walk("сегодня. ")+
                ". \nОчень любит "+singer.eat("бананы.") +
                ". \nРазрабатывает "+singer.singing("rock"));

    }
}