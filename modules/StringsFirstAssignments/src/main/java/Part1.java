public class Part1 {
    private static String EMPTY_STRING="";

    public String findSimpleGene(String dna) {
        int indexATG=-1;
        int indexTAA=-1;
        String sGene=EMPTY_STRING;
        indexATG = dna.indexOf("ATG");
        //System.out.println("indexATG = "+indexATG);
        if (indexATG==-1){
            return EMPTY_STRING;
        }

        indexTAA = dna.indexOf ("TAA", indexATG);
        //System.out.println("indexTAA = "+indexTAA);
        if (indexTAA==-1){
            return EMPTY_STRING;
        }

        sGene=dna.substring(indexATG,indexTAA+3);
        //System.out.println(sGene.length()+" "+sGene.length()%3);
        if (sGene.length()%3!=0){
            return EMPTY_STRING;
        }

        return sGene;
    }
    public static void main (String args[]) {
        String sFindSimpleGene=EMPTY_STRING;
        String[] dna = {
                "LATGLKNDBJKJHJUGTAATYFJHYFGTJHGFJGHFJHGARG",
                "LATFJHYFGTJHGFJGHFJHGARG",
                "LAHJUGTAATYFJHYFGTJHGFJGHFJHGARG",
                "LATGLKNDBJKFJHJUGTAATYFJHYFGTJHGFJGHFJHGARG",
                "LFGTJHGFJGHFJHGARG"
        };
        System.out.println("hi");
        Part1 p1 = new Part1();

        for (String TestDna:dna) {
            sFindSimpleGene = p1.findSimpleGene(TestDna);
            System.out.printf("dna: %s\n gene: %s\n",TestDna, sFindSimpleGene);
        }
    }
}
