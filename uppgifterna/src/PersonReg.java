import java.util.ArrayList;

public class PersonReg {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void addPerson(Person p){
        persons.add(p);
    }

    public Person findPerson(String pNbr){
        for(Person tmp: persons){
            if(tmp.getPnbr().equals(pNbr)){
                System.out.println("Hittade användere med namnet" + tmp.getName());
                return tmp;
            }
        }
        return null;
    }

    public Person removePerson(String pNbr){
        Person tmp = findPerson(pNbr);

        if(tmp != null){
            System.out.println("Användaren "+ tmp.getName()+" "+tmp.getPnbr()+ " har tagits bort.");
            persons.remove(tmp);
            return tmp;
        }
        else{
            return tmp;
        }
    }

    public ArrayList<Person> getList(){
        return persons;
    }
    public void setList(ArrayList<Person> newLista){
        persons = newLista;
    }
}
