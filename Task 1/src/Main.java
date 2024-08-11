import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )
        System.out.println("Введите количество ингредиентов которые у Вас есть");
        System.out.println("Жабьи глаза");
        toadEyesCount = new Scanner(System.in).nextInt();
        System.out.println("Слёзы вурдалака");
        ghoulTearsCount = new Scanner(System.in).nextInt();
        System.out.println("Кости ворона");
        ravenBonesCount = new Scanner(System.in).nextInt();
        System.out.println("Пельмени");
        dumplingsCount = new Scanner(System.in).nextInt();
        int zoro = 0;
        int durability = 0;
        int secrecy = 0;
        int prohibitions = 0;

        if ((toadEyesCount > 3 ) && (ravenBonesCount > 1 )) {
            zoro++ ;
            System.out.println("Вы можете приготовить Эликсир зоркости ");
        }
        if ((ravenBonesCount > 2) && (dumplingsCount >= 4)){
            durability++;
            System.out.println("Вы можете приготовть Эликсир стойкости ");
        }
        if((toadEyesCount >= 7) && (dumplingsCount >= 1) && (toadEyesCount >= 2)){
            secrecy++;
            System.out.println("Вы можете приготовить Эликсир скрытности");
        }
        if ((ghoulTearsCount >= 5) && (dumplingsCount >= 10) && (toadEyesCount >= 4) && (ravenBonesCount >=3)) {
            prohibitions++;
            System.out.println("Вы можете приготовить зпретный Эликсир");
        }
        if ((zoro < 1) && (durability < 1) && (secrecy < 1) && (prohibitions < 1)){
            System.out.println("Вы не можете изготовить Эликсир");
        }



        //todo реализовать ввод пользователем кол-ва ингредиентов.

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда
    }
}
