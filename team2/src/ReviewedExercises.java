import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ReviewedExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        //cream un Meniu cu o bucla care merge pana cand scriem 25 si exit = true
        while (!exit) {
            //se afiseaza mesaje de tip meniu pentru fiecare functie
            System.out.println("Select a function:");
            System.out.println("1. Calculate the area of a circle");
            System.out.println("2. Calculate factorial of a number");
            System.out.println("3. Find the maximum of 3 numbers");
            System.out.println("4. Check if a number is prime");
            System.out.println("5. Generate Fibonacci series");
            System.out.println("6. Check if a word is a palindrome");
            System.out.println("7. Find the longest word in a sentence");
            System.out.println("8. Calculate the sum of two numbers");
            System.out.println("9. Calculate the arithmetic mean of numbers");
            System.out.println("10. Reverse a string");
            System.out.println("11. Check if a number is even or odd");
            System.out.println("12. Find the largest and smallest numbers in a list");
            System.out.println("13. Check if two numbers are divisible");
            System.out.println("14. Check if a number is a perfect square");
            System.out.println("15. Calculate the sum of digits of a number");
            System.out.println("16. Calculate the digital root of a number");
            System.out.println("17. Check if a number is a palindrome");
            System.out.println("18. Calculate the sum of the first N numbers");
            System.out.println("19. Calculate the sum of the first N perfect squares");
            System.out.println("20. Calculate the distance between two points");
            System.out.println("21. Check if two words are anagrams");
            System.out.println("22. Find the most used word in a sentence");
            System.out.println("23. Find the most used letter in a sentence");
            System.out.println("24. Generate a random password");
            System.out.println("25. Check if a number is Harshad");
            System.out.println("26. Check if a number is Kaprekar");
            System.out.println("27. Exit");
            //citim de la utilizator un numar pentru alegerea unei functii
            int choice = scanner.nextInt();
            scanner.nextLine();
            //folosim switch pentru a aborda fiecare functie dupa numarul corespunzator
            switch (choice) {
                case 1:
                    ariaCercului();
                    break;
                case 2:
                    factorialNumber();
                    break;
                case 3:
                    maximOf3No();
                    break;
                case 4:
                    numarPrim();
                    break;
                case 5:
                    fibonacci();
                    break;
                case 6:
                    palindrome();
                    break;
                case 7:
                    longestWord();
                    break;
                case 8:
                    suma();
                    break;
                case 9:
                    medieAritmetica();
                    break;
                case 10:
                    reverseString();
                    break;
                case 11:
                    evenOrOdd();
                    break;
                case 12:
                    largestAndSmallest();
                    break;
                case 13:
                    esteDivizibil();
                    break;
                case 14:
                    patratPerferct();
                    break;
                case 15:
                    sumOfDigits();
                    break;
                case 16:
                    sumOfDigitsPanaLaOCifra();
                    break;
                case 17:
                    numarPalindrom();
                    break;
                case 18:
                    sumaPrimelorNNumere();
                    break;
                case 19:
                    sumaPrimelorNPatratePerfecte();
                    break;
                case 20:
                    distrantaDintre2Puncte();
                    break;
                case 21:
                    anagrame();
                    break;
                case 22:
                    celMaiFolositCuvant();
                    break;
                case 23:
                    ceaMaiFolositaLitera();
                    break;
                case 24:
                    generatorDeParole();
                    break;
                case 25:
                    harshadNumbers();
                    break;
                case 26:
                    kaprekarNumbers();
                    break;
                case 27:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }

    }

    public static void ariaCercului(){

        Scanner scanner = new Scanner(System.in);

        // - Calculate the area of a circle
        System.out.println("Introduceti un numar pentru raza: ");
        //se citeste raza de la utilizator
        int raza = scanner.nextInt();

        //se calculeaza aria si se atribuie unei variabile
        double circleAria =  Math.PI * Math.pow(raza, 2);
        //se afiseaza aria
        System.out.println("- Calculate the area of a circle " + circleAria);



    }

    public static void factorialNumber(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un numar: ");
        int number;
        int factorial = 1;
        //se citeste de la user un numar intreg
        number = scanner.nextInt();
        //se parcurge o bucla pana la numarul introdus
        for(int i =1; i<=number;i++){
            //se creeaza factorialul
            factorial = factorial * i;
        }
        //se afiseaza factorialul
        System.out.println("Factorialul numarului este: " + factorial);


    }

    public static void maximOf3No(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti 3 numere");
        int[] numere = new int[3];
        int max;
        //se citeste de la user array ul de integers
        for(int i = 0; i<numere.length;i++){
            numere[i] = scanner.nextInt();
        }

        max = numere[0];
        //se parcurge array ul si se cauta numarul maxim
        for(int i = 0; i<numere.length;i++){
            if(numere[i] > max){
                max = numere[i];
            }
        }
        //se afiseaza numarul maxim
        System.out.println("Maximul dintre cele 3 numere este: " + max);


    }

    public static void numarPrim(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un numar:");
        //se citeste un numar intreg de la user
        int numar = scanner.nextInt();
        //int divizori = 0;//se poate sterge
        boolean isPrime = true;//adaugat de noi
        //se parcurge bucla pana la radicalul numarului incepand cu 2 pentru a evita cazul clasic de impartire la 1
        for(int i = 2; i*i <=numar; i++){
            //se verifica daca numarul are divizori
            if (numar % i == 0) {
                //am scos partea de divizori si am adaugat un boolean
                //daca se indeplineste conditia se schimba si valoarea lui isPrime si se iese din bucla
                isPrime = false;
                break;
            }
        }
        //se verifica starea booleanului si se afiseaza mesajul
        if (isPrime) {
            System.out.println("Numarul este prim");
        }
        else{
            System.out.println("Numarul nu este prim");
        }


    }

    public static void fibonacci(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un numar: ");

        //schimbat numele variabilei
        //int primeleNNumere = scanner.nextInt();
        //se citeste lungimea sirului
        int fibonacciArrayLength = scanner.nextInt();


        System.out.println("Sirul lui Fibonacci pentru primele " + fibonacciArrayLength + " numere este: ");
        int No1 = 1;
        int No2 = 0;
        int No3;

        //se parcurge bucla pana la lungimea ceruta
        for(int i = 0; i < fibonacciArrayLength; i++){
            //se construieste sirul lui fibonacci prin insumarea termenilor precedenti
            //no3 = no2 + no1, no4 = no3+no2, ...
            //se afiseaza sirul lui fibonacci
            System.out.print(No2 + " ");
            No3 = No1 + No2;
            No2 = No1;
            No1 = No3;
        }



    }

    public static void palindrome(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un cuvant");
        //se citeste de la user un cuvantn
        String text = scanner.nextLine();
        boolean estePalindrom = true;

        //primul for incepe de la primul caracter catre jumatatea string-ului
        for(int i = 0 ; i < (text.length() / 2); i++){
            //am "spart" for-ul lung in 2 for-uri mai usor de citit
            //al doilea incepe de la ultimul caracter catre jumatatea string-ului
            for (int j = text.length()-1; j > (text.length() / 2); j--)
                //se verifica caracter cu caracter daca sunt la fel in ambele parcurgeri
                if(text.charAt(i) != text.charAt(j)){
                    estePalindrom = false;
                    break;
                }
        }
        //se afiseaza mesajul
        if(estePalindrom){
            System.out.println("Cuvantul este palindrom");
        }
        else{
            System.out.println("Cuvantul nu este palindrom.");
        }



    }

    public static void longestWord(){
        Scanner scanner = new Scanner(System.in);

        //se citeste o propozitie de la utilizator
        System.out.println("What is the longest word in the sentence? - enter a sentence: ");
        String sentence = scanner.nextLine();
        //se imparte fiecare cuvant al propozitiei intr-un array de string-uri
        String[] sentenceArray = sentence.split(" ");
        String longestWord = "";
        //se parcurge array-ul, se verifica si se stabileste care cuvant este mai lung
        for (int i = 0; i < sentenceArray.length; i++){
            if(sentenceArray[i].length() > longestWord.length()){
                longestWord = sentenceArray[i];
            }
        }
        //se afiseaza cuvantul cel mai lung
        System.out.println("The longest word is: " + longestWord);


    }

    public static void suma(){
        Scanner scanner = new Scanner(System.in);
        //se citesc doua numere de la utilizator
        System.out.println("Introduceti 2 numere: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        //se face operatia de adunare si se stocheaza in variabila sum
        int sum = num1 + num2;
        //se afiseaza suma
        System.out.println("The sum of num1 and num2 is " + sum);

    }

    public static void medieAritmetica(){
        Scanner scanner = new Scanner(System.in);
        //se citeste de la utlizator numarul de numere pentru care se va face suma
        System.out.println("Pentru cate numere se va face suma: ");
        int numar = scanner.nextInt();
        int[] listaNumere = new int[numar];
        //se citesc de la utilizator numerele pentru suma si se stocheaza intr-un array
        System.out.println("Introduceti numerele din lista: ");
        for(int i = 0; i < numar; i++){
            listaNumere[i] = scanner.nextInt();
        }

        int sum = 0;
        //se parcurge un for in array-ul de numere si se calculeaza suma
        for(int i = 0; i < numar; i++){
            sum += listaNumere[i];
        }
        //se calculeaza media si se stocheaza in variabila avg
        int avg = sum / numar;
        //se afiseaza media
        System.out.println("Media aritmetica a numerelor este: " + avg);



    }

    public static void reverseString(){
        Scanner scanner = new Scanner(System.in);
        //se citeste un text de la utilizator
        System.out.println("Introduceti un text");
        String text = scanner.nextLine();
        String reverseString = "";
        //se parcurge textul de la coada la cap si se stocheaza fiecare caracter parcurs
        //in variabila pentru textul inversat
        for(int i = text.length()-1; i>= 0; i--){
            reverseString += text.charAt(i);
        }
        //se afiseaza inversul textului
        System.out.println("Inversul textului este: " + reverseString);



    }

    public static void evenOrOdd(){
        Scanner scanner = new Scanner(System.in);
        //se citeste un numar de la utilizator
        System.out.println("Introduceti un numar: ");
        int numar = scanner.nextInt();
        //se verifica daca acesta este par sau nu
        //(daca prin impartirea sa la 2 are rest sau nu)
        //in caz ca are restul 0, numarul este par, in caz contrar numarul este impar
        if (numar % 2 == 0) {
            //se afiseaza mesajul in functie de numar
            System.out.println("Numarul este par");
        }
        else{
            System.out.println("Numarul este impar");
        }


    }

    public static void largestAndSmallest(){
        Scanner scanner = new Scanner(System.in);
        //se citeste lungimea array-ului de la utilizator
        System.out.println("Introduceti cate numere sunt in lista");
        int lungimeLista = scanner.nextInt();
        int[] lista = new int[lungimeLista];

        //se citesc de la utilizator valorile array-ului
        System.out.println("Introduceti numerele din lista");
        for(int i = 0; i< lungimeLista; i++){
            lista[i] = scanner.nextInt();
        }

        //se stocheaza in variabile de maxim si minim prima valoare a array-ului
        int max = lista[0];
        int min = lista[0];

        //se parcurge array-ul si se verifica care este valoarea maxima si minima a array-ului
        for(int i = 0; i< lungimeLista; i++){
            if(lista[i] > max){
                max = lista[i];
            }
            if (lista[i] < min) {
                min = lista[i];
            }
        }

        //se afiseaza maximul si minimul
        System.out.println("Cel mai mare numar din lista este: " + max + "\n Cel mai mic numar din lista este: " + min);


    }

    public static void esteDivizibil(){
        Scanner scanner = new Scanner(System.in);

        //se citesc numerele de la utilizator
        System.out.println("Introduceti un numar: ");
        int no1 = scanner.nextInt();
        System.out.println("Introduceti un numar care sa se imparta la primul numar:  ");
        int no2 = scanner.nextInt();

        //se verifica daca no1 este divizibil cu no2 si se afiseaza rezultatul
        //(daca restul impartirii lor este egal cu 0)
        if (no1 % no2 == 0) {
            System.out.println("Numerele sunt divizibile, rezultatul impartirii este: " + (no1/no2));
        }
        //se verifica daca no2 este divizibil cu no1 si se afiseaza rezultatul
        else if (no2%no1 == 0) {
            System.out.println("Numerele sunt divizibile");//adaugat pentru a verifica divizibilitatea no2/no1
        }
        //in caz contrar, se afiseaza mesajul respectiv
        else{
            System.out.println("Numerele nu sunt divizibile");
        }


    }

    public static void patratPerferct(){
        Scanner scanner = new Scanner(System.in);
        //se citeste un numar de la utilizator
        System.out.println("Introduceti un numar:");
        int numar = scanner.nextInt();
        //se calculeaza radacina patrata
        double radacina = Math.sqrt(numar);

        //if ((radacina * 10) % 10 == 0)
        //se verifica daca radacina ridicata la puterea a doua este egala cu numarul introdus

        if (Math.pow(radacina,2)==numar){
            //se afiseaza rezultatul
            System.out.println("numarul este patrat perfect, radacina lui este: " + radacina);
        }
        else{
            System.out.println("Numarul nu este patrat perfect");
        }


    }

    public static void sumOfDigits(){
        Scanner scanner = new Scanner(System.in);
        //se citeste un numar de la utilizator
        System.out.println("Introduceti un numar: ");
        int numar = scanner.nextInt();
        int sum = 0;
        //se parcurge numarul si se calculeaza suma
        //adunandu-se fiecare cifra a numarului, pornind de la utlima
        //si impartindu-se numarul la 10 dupa fiecare iteratie
        while (numar > 0) {
            sum += numar % 10;
            numar = numar / 10;
        }
        //se afiseaza suma
        System.out.println("Suma cifrelor din numar este: " + sum);


    }

    public static void sumOfDigitsPanaLaOCifra(){
        Scanner scanner = new Scanner(System.in);
        //se citeste un numar de la utilizator
        System.out.println("Introduceti un numar: ");
        int numar = scanner.nextInt();
        //se atribuie variabilei digitalRoot rezultatul functiei calculateDigitalRoot
        int digitalRoot = calculateDigitalRoot(numar);

        //se afiseaza cifra ramasa
        System.out.println("cifra ramasa este: " + digitalRoot);

        //nu era o rezolvare corecta, probabil nu s-a inteles cerinta si am luat din rezolvarea mea
        //(Sebastian F)

    }

    public static int calculateDigitalRoot(int n) {
        // daca n e cifra se returneaza direct cifra
        if (n < 10) {
            return n;
        }

        // se calculeaza suma numerelor din numar
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        //se face recursiv pana se ajunge la digitalRoot
        return calculateDigitalRoot(sum);
    }

    public static void numarPalindrom(){
        Scanner scanner = new Scanner(System.in);
        // se citeste un numar de la utilizator
        System.out.println("Introduceti un numar");
        int numar = scanner.nextInt();
        //se face o copie pentru numar
        int copyOfNumer = numar;
        int numarReverse = 0;

        //parcurgem o bucla pentru copie si atribuim variabilei numarReverse inversul
        //variabilei numar
        while (copyOfNumer > 0) {
            numarReverse = numarReverse * 10 + copyOfNumer % 10;
            copyOfNumer = copyOfNumer / 10;
        }

        //se verifica daca numarul introdus este palindrom si se afiseaza mesajul
        if (numar == numarReverse) {
            System.out.println("Numarul este palindrom");
        }
        else{
            System.out.println("Numarul nu este palindrom");
        }


    }

    public static void sumaPrimelorNNumere(){
        Scanner scanner = new Scanner(System.in);

        //se introduce un numar de la utilizator pentru lungimea array-ului
        System.out.println("Introduceti un numar:");
        int n = scanner.nextInt();
        int sum = 0;

        //se parcurge un for de la 1 pana la lungimea array-ului si se calculeaza suma lor
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        //se afiseaza suma
        System.out.println("Suma primelor " + n + " numere este: " + sum);


    }

    public static void sumaPrimelorNPatratePerfecte(){
        Scanner scanner = new Scanner(System.in);
        //se citeste un numar de la utilizator
        System.out.println("Introduceti un numar:");
        int n = scanner.nextInt();
        int sum = 0;
        //se parcurge un for de la 1 pana la numarul introdus si se calculeaza suma
        for(int i = 1; i <= n; i++){
            sum += Math.pow(i, 2);
        }
        //se afiseaza suma
        System.out.println("Suma primelor " + n + " patrate perfecte este: " + sum);


    }

    public static void distrantaDintre2Puncte(){
        Scanner scanner = new Scanner(System.in);
        //se citesc de la utilizator coordonatele punctelor P1 si P2
        System.out.println("Introduceti coordonatele celor 2 puncte: ");
        System.out.print("X-ul primului punct este: ");
        int p1X = scanner.nextInt();
        System.out.print("\nY-ul primului punct este: ");
        int p1Y = scanner.nextInt();
        System.out.print("\nX-ul celui de al doilea punct este: ");
        int p2X = scanner.nextInt();
        System.out.println("\nY-ul celui de al doilea punct este: ");
        int p2Y = scanner.nextInt();
        //se calculeaza distanta cu formula matematica
        double distanta = Math.sqrt(Math.pow((p1X + p2X), 2) + Math.pow((p1Y + p2Y),2));
        //se afiseaza distanta
        System.out.println("Distanta dintre cele 2 puncte este: " +  distanta);



    }

    public static void anagrame(){
        Scanner scanner = new Scanner(System.in);
        //se citesc 2 cuvinte de la tastatura
        System.out.println("Introduceti 2 cuvinte: \nPrimul cuvant este: ");
        String cuvant1 = scanner.nextLine();
        System.out.println("Al doilea cuvant este: ");
        String cuvant2 = scanner.nextLine();

        int sumCuvant1 = 0, sumCuvant2 = 0;
        //se verifica lungimea celor 2 cuvinte, daca sunt egale POT fi anagrame, in caz contrar
        //NU POT fi anagrame
        if(cuvant1.length() == cuvant2.length()){
            //se calculeaza suma caracterelor fiecarui cuvant
            for(int i = 0; i<cuvant1.length(); i++){
                sumCuvant1 += cuvant1.codePointAt(i);
                sumCuvant2 += cuvant2.codePointAt(i);
            }
            //se verifica daca suma lor este egala, atunci se afiseaza ca sunt anagrame
            //in caz contrar, se afiseaza opusul
            if (sumCuvant1 == sumCuvant2) {
                System.out.println("Cuvintele sunt anagrame");
            }
            else{
                System.out.println("Cele 2 cuvinte nu sunt anagrame");
            }
        }
        else{
            System.out.println("Cele 2 cuvinte nu sunt anagrame.");
        }


    }

    public static void celMaiFolositCuvant(){
        Scanner scanner = new Scanner(System.in);
        //se introduce de la utlizator o fraza
        System.out.println("Introduceti o fraza");
        String text = scanner.nextLine();
        //se "sparge" fraza in cuvinte care sunt stocate intr-un array
        String[] cuvinteleDinText = text.split(" ");
        int celMaiComunCuvant = 0;
        int pozitie = 0;
        //se parcurge array-ul cu un prim contor
        for(int i = 0; i <cuvinteleDinText.length-1; i++){
            //se parcurge array-ul cu un al doilea contor care sa inceapa cu o pozitie in fata lui i
            //pentru a se numara aparitiile fiecarui cuvant
            int verif = 1;
            for(int j = i+1;j<cuvinteleDinText.length;j++){
                if (cuvinteleDinText[i].compareTo(cuvinteleDinText[j]) == 0) {
                    verif++;
                }

            }
            //se compara si se stabileste cuvantul cu cele mai multe aparitii cat si pozitia urmatoare
            if (verif > celMaiComunCuvant) {
                celMaiComunCuvant = verif ;
                pozitie = i;
            }
        }
        //se afiseaza cuvantul cel mai folosit si numarul sau de aparitii
        System.out.println("Cel mai folosit cuvant este: " + cuvinteleDinText[pozitie] + " si a aparut de: " + celMaiComunCuvant + " ori");


    }

    public static void ceaMaiFolositaLitera(){
        Scanner scanner = new Scanner(System.in);
        //se citeste de la tastatura un cuvant
        System.out.println("Introduceti o fraza");
        String text = scanner.nextLine();
        int ceaMaiComunaLitera = 0;
        int pozitie = 0;

        //se parcurge textul cu 2 for-uri care sa compare fiecare litera din cuvant
        //si sa se numere aparitiile fiecarei litere din cuvant
        for(int i = 0; i <text.length(); i++){
            int verif = 1;
            for(int j = i+1;j<text.length();j++){
                if (text.charAt(i) == text.charAt(j)) {
                    verif++;
                }

            }
            //se compara si se stabilesc cea mai comuna litera si pozitia urmatoare pentru for
            if (verif > ceaMaiComunaLitera) {
                ceaMaiComunaLitera = verif ;
                pozitie = i;
            }
        }
        //se afiseaza cea mai folosita litera si numarul de aparitii
        System.out.println("Cea mai folosita litera este: " + text.charAt(pozitie) + " si a aparut de: " + ceaMaiComunaLitera + " ori");


    }

    public static void generatorDeParole(){
        System.out.println("Parola voastra generata automat este: ");
        Scanner scanner = new Scanner(System.in);
        //se stabileste lungimea parolei
        //int nrCaractere = 10;
        //se citeste lungimea parolei de la utilizator
        int nrCaractere = scanner.nextInt();
        String parola = "";
        //se stocheaza in variabile toate caracterele care pot fi in parola
        char[] simboluri = {'!', '@', '#', '$', '%', '^', '&', '*', '+', '='};
        char[] numere = {'1', '2', '3', '4','5', '6', '7','8', '9', '0'};
        char[] litereMici = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        char[] litereMari = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        //se parcurge o bucla in care se stocheaza in variabila parola
        //caractere alese aleatoriu din fiecare variabila de mai sus
        while (nrCaractere > 0) {
            double caracterRandom = Math.random();
            //se verifica daca caracterRandom are o anumita valoare sa se ia dintr-o variabila caractere
            //si sa se stocheze in variabila parola
            if (caracterRandom <= 0.2) {
                parola += simboluri[(int) (Math.random() * 9)];
            }
            else if(caracterRandom <= 0.5){
                parola += litereMici[(int) (Math.random() * 26)];

            }
            else if(caracterRandom <= 0.7){
                parola += litereMari[(int) (Math.random() * 26)];

            }
            else if (caracterRandom <= 1){
                parola += numere[(int) (Math.random() * 9)];

            }
            //se micsoreaza cu cate o unitate lungimea pana ajunge sa fie parola completata in totalitate
            nrCaractere--;
        }
        //se afiseaza parola
        System.out.println(parola);

    }

    public static void kaprekarNumbers(){
        Scanner scanner = new Scanner(System.in);
        //se citeste un numar de la utilizator
        System.out.println("Introduceti un numar: ");
        int numar = scanner.nextInt();
        //se stabileste patratul numarului ales
        double patratNumar = (int) Math.pow(numar, 2);
        //se face o copie pentru numar
        int copyOfPatratNumar = (int) patratNumar;
        int sum = 0;
        int length = 0;
        int jum1 = 0, jum2 = 0;

        //se parcurge o bucla pentru a se afla lungimea patratului numarului
        while (copyOfPatratNumar > 0) {
            copyOfPatratNumar = copyOfPatratNumar / 10;
            length++;
        }

        //se stocheaza in jum1 restul impartirii patratului numarului cu 10 ridicat la puterea
        //lungime/2
        jum1 = (int) patratNumar % (int) Math.pow(10, length/2);
        //patratul numarului devine catul impartirii de mai sus
        patratNumar = (int) patratNumar /(int)  Math.pow(10, length/2);
        //se stocheaza in jum1 restul impartirii noului patrat al numarului cu 10 ridicat la puterea
        //lungime/2
        jum2 = (int) patratNumar % (int) Math.pow(10, length/2);
        //se stocheaza suma celor doua jumatati
        sum = jum1 + jum2;
        //se verifica daca suma este egala cu numarul si se afiseaza mesajul dorit
        if (sum == numar) {
            System.out.println("Numarul este un numar Keprekar");
        }
        else{
            System.out.println("Numerul nu este un numar Keprekar");
        }


    }

    public static void harshadNumbers(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un numar: ");
        //numarul introdus de user
        int numar = scanner.nextInt();
        //variabilele de care avem nevoie
        int sum = 0;
        int copyOfNumar = numar;
        //adunam cifrele numarului
        while (copyOfNumar > 0) {
            sum += copyOfNumar % 10;
            copyOfNumar = copyOfNumar / 10;
        }
        //vedem daca numarul este divizibil cu suma cifrelor
        if (numar % sum == 0) {
            System.out.println("numarul este un numar Harshad");
        }
        else{
            System.out.println("numarul nu este un numar Harshad");
        }


    }
}