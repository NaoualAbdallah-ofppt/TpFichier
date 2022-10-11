import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Client {
    private int num;
    private String nom;
    public Client() {
    }
    public Client(int num, String nom) {
        this.num = num;
        this.nom = nom;
    }

    public void setNum(int num) {
        this.num = num;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNum() {
        return num;
    }

    public String getNom() {
        return nom;
    }
    @Override
    public String toString() {
        return "Client{" +
                "num=" + num +
                ", nom='" + nom + '\'' +
                '}';
    }
    public void ajouterFichier()
            throws IOException
    {
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        sb.append("|");
        sb.append(nom);
        sb.append("\n");
        
        FileWriter fw = new FileWriter("client.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(sb.toString());
        bw.close();
        fw.close();



    }
    public static ArrayList<Client> listerFichier()
    throws IOException
{
    ArrayList <Client> AL = new ArrayList<Client>();
FileReader fr = new FileReader("client.txt");
BufferedReader br = new BufferedReader(fr);
String ligne;
while ((ligne=br.readLine())!=null)
{
    StringTokenizer st = new StringTokenizer(ligne,"|");
    int num=Integer.parseInt(st.nextToken().toString());
    String nom=st.nextToken().toString();
    Client cl = new Client(num, nom);
    AL.add(cl);
}
br.close();
fr.close();


return AL;
}

}
