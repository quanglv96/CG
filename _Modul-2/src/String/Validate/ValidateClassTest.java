package String.Validate;

public class ValidateClassTest {
    private static ValidateClasse validateClasse;
    public static final String[] validClasse=new String[]{"C0318G","C0822H"};
    public static final String[] invalidClasse=new String[]{"M0318G","P0323A","Pa3233A","P03233G"};

    public static void main(String[] args) {
        validateClasse =new ValidateClasse();
        for(String classe: validClasse){
            boolean isvalid= validateClasse.validate(classe);
            System.out.println(" Classs is " +classe+" is valid "+isvalid);
        }
        for(String classe: invalidClasse){
            boolean isvalid= validateClasse.validate(classe);
            System.out.println(" Classs is " +classe+" is valid "+isvalid);
        }
    }
}
