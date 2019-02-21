import currency.Bitcoin;
import currency.CanDollar;
import currency.Dollar;
import currency.Euro;
import libs.Calc;
import libs.WorkWithArray;
import libs.WorkWithList;
import org.apache.log4j.Logger;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.*;

public class MainClass {

    public static void main(String[] args) {


        System.out.println("=================================================");
        System.out.println("Hello world !!");
        Calc.div(1,2);
        Calc.div(-3.2342342342342342,0);
        int [] massive1 = new int[]{2, 3, 4, 5};
        WorkWithArray.backwardsArraydisplay(massive1);
//        WorkWithArray.backwardsArraydisplay(new int[2;3;6;8])
        String text[] = {"tes", "test", "test123"};
        WorkWithArray.search(text);


        int var1 = 3;
        int var2;
        var2 = 5;
//        System.out.println(var1 + var2);
        Calc.sum(var1,var2);

        int var3 = 5, var4 = 6;
//        System.out.println(var3+var4);
        Calc.sum(var3,var4);
        Calc.multiplication(var3,var4);

        String s1 = "Firstqq";
        int s2 = 11;
        Calc.sum(s1,s2);

        int rez_1 = Calc.sum(4,5);
        String rez_2 = Calc.sum("test","1");
        int rez_3 = Calc.sum(5,"12");

        System.out.println(Calc.sum(3,"3a3") + 3);

        int[] massive = {2, 3, 26, 7, 28, 10, 9, 20, 33};
        System.out.println("massive item = " + massive[2]);

        for(int i = 0; i < massive.length; i++) {                                 // "for" array

            if (massive[i] > 10) {                                             // if..else
                System.out.println(massive[i] + " First element more than 10");
            } else if (massive[i] == 10) {
                System.out.println(massive[i] + " Element equal 10");

            } else {
                System.out.println(massive[i] + " Меньше 10");
            }
        }
        System.out.println("=========THE END=========");

        int [] [] massiveMassive = {{1, 1, 1},{1, 1, 1},{1, 1, 1}};
        int k = 1;
        int[] [] massiveMassive2 = new int[3][3];
        /**
         * Создаем объект workWithArray с типом WorkWithArray
         */
        WorkWithArray workWithArray = new WorkWithArray();
        workWithArray.createMatrix(5,6,8);
        workWithArray.left(workWithArray.createMatrix(5,5,1),8);
        workWithArray.right(workWithArray.createMatrix(5,5,1),8);


        /**
         * Объявляем динамический список
         */
        List<String> ourList = new ArrayList();
        ourList.add("test");
        System.out.println(ourList);
        ourList.add("test1");
        System.out.println(ourList);
        System.out.println(ourList.get(1));
        System.out.println("Sizq = " + ourList.size());

        /**
         * foreach
         */
        for (String element: ourList) {
            System.out.println(element);
        }

        /**
         * Lesson 6 List, Collection, Map
         */
        List <List<String>> ourListList = new ArrayList<>(); //Объявляю список списков
//        System.out.println(ourListList);
        ourListList.add(new ArrayList<>());
//        System.out.println(ourListList);
        ourListList.add(new ArrayList<>());
        System.out.println(ourListList);

        ourListList.get(1).add("test");
        ourListList.get(1).add("test1");
        ourListList.get(1).remove(0);
        System.out.println(ourListList);

        List<String> lineList = new ArrayList<>();
        lineList.add("element1");
        lineList.add("element2");
//        System.out.println(lineList);

        ourListList.add(new ArrayList<>());
        ourListList.get(2).addAll(lineList);
//        ourListList.add(lineList);
//        System.out.println(ourListList);
        ourListList.get(1).addAll(0,lineList);
//        System.out.println(ourListList);
        lineList.add("element3");
        ourListList.add(lineList);
        System.out.println(ourListList);
        for (List<String> line:ourListList
             ) {
            System.out.println(line);
        }
        System.out.println("=========================================");

        Map<String,Integer> ourMap = new HashMap<>(); //key - value
        ourMap.put("login", 23);
        ourMap.put("path", 555);
        System.out.println(ourMap); //Сортировка внутри Map отрабатывает по hash-ключам
        System.out.println(ourMap.get("path"));
        ourMap.put("path", 777);
        System.out.println(ourMap);
        System.out.println("size = " + ourMap.size());



        List<Map<String,Integer>> ourLisMap = new ArrayList<>(); //Список, в котором каждая строка - Map
        ourLisMap.add(new HashMap<>());
        ourLisMap.get(0).put("login", 23);
        ourLisMap.get(0).put("pass", 777);
        ourLisMap.get(0).put("pass1", 778);
        System.out.println(ourLisMap);
        System.out.println("ourLisMap.get(0).get(\"pass1\") = " + ourLisMap.get(0).get("pass1"));

        System.out.println("=========================================");
        ourLisMap.add(new HashMap<>());
        ourLisMap.get(1).put("login",24);
        ourLisMap.get(1).put("pass", 754);
        ourLisMap.get(1).put("pass1",978);
        System.out.println("ourLisMap" + ourLisMap);

        for (int i = 0; i < ourLisMap.size() ; i++) {
            System.out.println("Line " + (i+1) + " pass = " + ourLisMap.get(i).get("pass"));
        }

        System.out.println("===================HW L6 ==========================");

        List<List<String>> homwWork = new ArrayList<>();
        WorkWithList workWithList = new WorkWithList();
        workWithList.addNewList(homwWork);
        workWithList.addValueToListList(homwWork, 0, "test01");
        workWithList.addNewList(homwWork);
        workWithList.addValueToListList(homwWork, 1, "test11");
        workWithList.addValueToListList(homwWork,0,"test02");
        workWithList.addValueToListList(homwWork,1,"test12");
        workWithList.addNewList(homwWork);
        workWithList.addValueToListList(homwWork,2,"test21");
        workWithList.addValueToListList(homwWork,9,"test13");
        workWithList.Sysout(homwWork);

        System.out.println("==========Lesson 7 ===================");
        Dollar dollar = new Dollar(28);
        System.out.println("kurs $ = " + dollar.getKursNBU());
        dollar.setKursNBU(28.5);
        System.out.println("kurs $ = " + dollar.getKursNBU());
        dollar.exchangeCurrencyToGrn(100);
        dollar.setKursNBU(29);
        dollar.exchangeCurrencyToGrn(100);

        Euro euro = new Euro(32);
        euro.exchangeCurrencyToGrn(100);

        System.out.println("=========Lesson 8 =============07.02.2019");
        euro.setKursNBU(31);
        euro.setMarga(0.15);
        euro.exchangeCurrencyToGrn(150);
        System.out.println("USD " + dollar.getMarga() + " / EUR "+ euro.getMarga());

        CanDollar cad = new CanDollar(24);
        cad.setMarga(0.3);
        cad.exchangeCurrencyToGrn(100);

        System.out.println("USD " + dollar.getMarga() + " / EUR "+ euro.getMarga() + " /CAD " + cad.getMarga());

        System.out.println("USD is free " + dollar.isFreeConv() + " /EUR is free " + euro.isFreeConv() + " /CAD is free " + cad.isFreeConv());

        //биткоин - заоверайдить exchange
        Bitcoin bitcoin = new Bitcoin(8000);
        bitcoin.exchangeCurrencyToGrn(20);

        Logger logger = Logger.getLogger("MainClass");
        logger.info("-Info-");
        logger.debug("-Debug-");
        logger.error("-Error-");
    }
}