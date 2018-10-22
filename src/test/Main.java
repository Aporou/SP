package test;
public class Main {

  public static void main(String[] args) {
    Carte carte = new Carte("Carte!");
    
    ImagineProxy img1 = new ImagineProxy("poza1.jpg");
    ImagineProxy img2 = new ImagineProxy("poza2.png");
 

    Sectiune cap1 = new Sectiune("Capitolul 1");
    cap1.add(new Text("Text 1"));
    cap1.add(new Text("Text 2"));

    cap1.add(img1);
    cap1.add(img2);
    carte.add(cap1);
    carte.add(new Text("Sfarsit!"));
    
    Sectiune cap2 = new Sectiune("Capitolul 2");
    cap2.add(new Text("Text 1"));
    
    cap2.print();
    carte.print();
    
  }

}
