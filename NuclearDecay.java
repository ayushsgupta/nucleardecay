import java.util.Scanner;
public class NuclearDecay {
  public static void main(String [] args) {
    System.out.println();
    Scanner input = new Scanner(System.in);

    System.out.print("Atomic number: ");
    int atomic_num = input.nextInt();

    System.out.print("Atomic mass: ");
    int atomic_mass = input.nextInt();

    String dfguffghj = input.nextLine();
    System.out.print("Element Symbol: ");
    String symbol = input.nextLine();

    System.out.print("Decay series: ");
    String series = input.nextLine();

    System.out.println();

    Element element = new Element();
    element.setElement(symbol);
    element.setAtomics(atomic_num, atomic_mass);

    System.out.println("Starting element: " + element.getAtomicMass() + " | " + element.getAtomicNumber() + " " + element.getElement());
    System.out.println("Decay Series:");
    System.out.println();

    for (int i = 0; i < series.length(); i++) {
      if (series.charAt(i) == 'A') {
        element.changeNum(-2);
        element.changeMass(-4);
      } else if (series.charAt(i) == 'B') {
        element.changeNum(1);
      } else if (series.charAt(i) == 'a') {
        element.changeNum(2);
        element.changeMass(4);
      } else if (series.charAt(i) == 'b') {
        element.changeNum(-1);
      }
      System.out.println(element.getAtomicMass() + " | " + element.getAtomicNumber() + " " + element.getElement());
    }
    System.out.println("Done");
  }
}
