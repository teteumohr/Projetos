package Projetos.concluidos;

import java.util.*;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();

        System.out.print("O Sistema esta em: ");
        System.out.println(loc.getDisplayLanguage());

        System.out.print("No: ");
        System.out.println(loc.getLanguage());
    }
}
