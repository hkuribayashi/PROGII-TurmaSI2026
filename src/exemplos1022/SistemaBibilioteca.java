package exemplos1022;

import java.util.ArrayList;
import java.util.List;

public class SistemaBibilioteca {

    public static void main(String[] args){
        /*
        List<Obra> obras = List.of(
            new Livro(1, "Ainda estou aqui", 2022, "Marcelo", "aaa", 200),
            new ArtigoCientifico(2, "PSO", 2026, "Hugo e cia", "Revista tal", "zaaa"),
            new AudioVisual(3, "Matrix", 1999, "diretor", 100, "MP4")
        );
         */
        List<Obra> obras = new ArrayList<Obra>();
        Livro l = new Livro(1, "Ainda estou aqui", 2022, "Marcelo", "aaa", 200);
        obras.add(l);

        ArtigoCientifico a = new ArtigoCientifico(2, "PSO", 2026, "Hugo e cia",
                                    "Revista tal", "zaaa");
        obras.add(a);

        AudioVisual av= new AudioVisual(3, "Matrix", 1999, "diretor", 100, "MP4");
        obras.add(av);

       for (Obra o: obras){
           if (o instanceof Imprimivel i){
               i.imprimirFichaCatalografica();
           }else {
               //Type casting
               AudioVisual ax = (AudioVisual) o;
               ax.executarMidia();
           }
       }

    }
}
