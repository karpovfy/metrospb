package metro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String in,out;
        in="Выборгская";
        out="Площадь Ленина";
        System.out.println("Откуда:"+out);
        //in=s.nextLine();
        System.out.println("Куда:"+in);
        //out=s.nextLine();

        Map<Vertex, List<Vertex>> metro = new HashMap<Vertex, List<Vertex>>();
        Graph graph = new Graph(metro);


        graph.addVertex("Девяткино");
        graph.addVertex("Гражданский проспект");
        graph.addVertex("Академическая");
        graph.addVertex("Политехническая");
        graph.addVertex("Площадь Мужества");
        graph.addVertex("Лесная");
        graph.addVertex("Выборгская");
        graph.addVertex("Площадь Ленина");
        graph.addVertex("Чернышевская");
        graph.addVertex("Площадь Восстания");
        graph.addVertex("Владимирская");
        graph.addVertex("Пушкинская");
        graph.addVertex("Технологический институт");
        graph.addVertex("Балтийская");
        graph.addVertex("Нарвская");
        graph.addVertex("Кировский завод");
        graph.addVertex("Автово");
        graph.addVertex("Ленинский проспект");
        graph.addVertex("Проспект Ветеранов");

        graph.addVertex("Парнас");
        graph.addVertex("Проспект Просвещения");
        graph.addVertex("Озерки");
        graph.addVertex("Удельная");
        graph.addVertex("Пионерская");
        graph.addVertex("Чёрная речка");
        graph.addVertex("Петроградская");
        graph.addVertex("Горьковская");
        graph.addVertex("Невский проспект");
        graph.addVertex("Сенная площадь");
        graph.addVertex("Технологический институт-2");
        graph.addVertex("Фрунзенская");
        graph.addVertex("Московские ворота");
        graph.addVertex("Электросила");
        graph.addVertex("Парк Победы");
        graph.addVertex("Московская");
        graph.addVertex("Звёздная");
        graph.addVertex("Купчино");


        graph.addVertex("Беговая");
        graph.addVertex("Новокрестовская");
        graph.addVertex("Приморская");
        graph.addVertex("Василеостровская");
        graph.addVertex("Гостиный двор");
        graph.addVertex("Маяковская");
        graph.addVertex("Площадь Александра Невского");
        graph.addVertex("Елизаровская");
        graph.addVertex("Ломоносовская");
        graph.addVertex("Пролетарская");
        graph.addVertex("Обухово");
        graph.addVertex("Рыбацкое");


        graph.addVertex("Спасская");
        graph.addVertex("Достоевская");
        graph.addVertex("Лиговский проспект");
        graph.addVertex("Площадь Александра Невского");
        graph.addVertex("Новочеркасская");
        graph.addVertex("Ладожская");
        graph.addVertex("Проспект Большевиков");
        graph.addVertex("Улица Дыбенко");


        graph.addVertex("Старая Деревня");
        graph.addVertex("Крестовский остров");
        graph.addVertex("Чкаловская");
        graph.addVertex("Спортивная");
        graph.addVertex("Адмиралтейская");
        graph.addVertex("Садовая");
        graph.addVertex("Звенигородская");
        graph.addVertex("Обводный канал");
        graph.addVertex("Волковская");
        graph.addVertex("Бухарестская");
        graph.addVertex("Международная");
        graph.addVertex("Проспект Славы");
        graph.addVertex("Дунайская");
        graph.addVertex("Шушары");


        graph.addEdge("Девяткино", "Гражданский проспект");
        graph.addEdge("Гражданский проспект","Академическая");
        graph.addEdge("Академическая","Политехническая");
        graph.addEdge("Политехническая","Площадь Мужества");
        graph.addEdge("Площадь Мужества","Лесная");
        graph.addEdge("Лесная","Выборгская");
        graph.addEdge("Выборгская","Площадь Ленина");
        graph.addEdge("Площадь Ленина","Чернышевская");
        graph.addEdge("Чернышевская","Площадь Восстания");
        graph.addEdge("Площадь Восстания","Владимирская");
        graph.addEdge("Площадь Восстания","Маяковская");
        graph.addEdge("Владимирская","Пушкинская");
        graph.addEdge("Владимирская","Достоевская");
        graph.addEdge("Пушкинская","Технологический институт");
        graph.addEdge("Технологический институт","Технологический институт-2");
        graph.addEdge("Технологический институт-2","Фрунзенская");
        graph.addEdge("Технологический институт-2","Садовая");
        graph.addEdge("Пушкинская","Звенигородская");
        graph.addEdge("Технологический институт","Балтийская");
        graph.addEdge("Балтийская","Технологический институт");
        graph.addEdge("Нарвская","Балтийская");
        graph.addEdge("Нарвская","Кировский завод");
        graph.addEdge("Кировский завод","Автово");
        graph.addEdge("Автово","Ленинский проспект");
        graph.addEdge("Ленинский проспект","Проспект Ветеранов");

        System.out.println("-----Кол-во-соседних-станций---:"+in);
        List l=graph.getStations(in);
        System.out.println("Кол-во:"+l.size());
        for(int i=0;i<l.size();i++)
            System.out.print(l.get(i).toString()+" ");

        System.out.println();

        isEdge(in,out,graph);
        System.out.println("========Матрица смежности======");
        System.out.println(metro);

	        /*System.out.println("Обход в глубину");
	        Set<String> st=graph.depthFirstTraversal(graph, in);
	        System.out.println(st.size());
            System.out.println(st.toString());

	        System.out.println("Обход в ширину");
	        Set<String> st1=graph.breadthFirstTraversal(graph, in);
	        System.out.println(st1.size());
            System.out.println(st1.toString());
		    */




    }

    static void isEdge(String from,String to, Graph graph)
    {

        System.out.println("====================================================================");
        System.out.println("Из станции:"+from+" на станцию:"+to);
        List<Vertex> l1,l2;
        l1=graph.getStations(from);
        l2=graph.getStations(to);

        ArrayList<Vertex> l3 =new ArrayList<Vertex> ();
        Vertex v=new Vertex(from);
        Vertex v1=new Vertex(to);
        l3.add(v);
        l3.add(v1);
        //System.out.println(l3+":");
        System.out.println(from+" Ребра "+l1);
        System.out.println(to+" Ребра "+l2);

        boolean edge1=Collections.disjoint(l1, l3);
        boolean edge2=Collections.disjoint(l2, l3);
        //System.out.println("Disjoint"+":"+edge1+":"+edge2);
        if ((edge1==true)&&(edge2==true))
            System.out.println("Нет ребер:");
        else
            System.out.println("Есть ребра:");

    }
}
