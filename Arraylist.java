import java.util.ArrayList;
class al {
public static void main(String [] args ) {
ArrayList <Integer> marks=new ArrayList <Integer>();
ArrayList <String> names=new ArrayList <>();
marks.add(203);
marks.add(23);
names.add("Prathima");
names.add("Sai ram ");
names.add("Sai");
System.out.println(names);
System.out.println(marks);
System.out.println(names.get(0)+" "+names.get(1));
names.remove(1);
System.out.println(names);
for(Integer i : marks)
{
    System.out.println(i);
}

}
}
output
/*
[Prathima, Sai ram , Sai]
[203, 23]
Prathima Sai ram 
[Prathima, Sai]
203
23
 */
