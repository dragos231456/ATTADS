package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /***
     * Florin e colegul nostru de birou cu o carisma de neegalat. E posibil ca el sa mai fi
     * ratat niste taskuri in sprint, dar niciodata nu a ratat o tigara cu vreun coleg.
     *
     * Astazi, din pacate Florin a trebuit sa alimenteze si evident, a ramas fara bani de tigari.
     * Trist si dezamagit de el si de ce avea sa urmeze, intra in birou cu capul in pamant si se
     * apuca de lucru.
     *
     * Ce a uitat Florin, este ca la noi la birou avem cutia milei, care chiar
     * astazi contine doua pachete de tigari: pachetul a si pachetul b.
     *
     * O data introdus la cutia milei, cand va fi chemat la tigara va sti exact ce are de facut.
     *
     * Inainte de a iesi pe terasa, face o oprire langa Gabi si Grecu si se uita la pachetele
     * A si B, care sunt deschise si procedeaza astfel:
     *
     * Daca pachetul A este gol, pastreaza pachetul B si iese cu el fara sa il mai verifice.
     * La fel, daca pachetul B este gol, pastreaza pachetul A fara sa mai fie atent daca nu
     * cumva si pachetul A este gol.
     *
     * Daca niciunul din pachete nu este gol, Florin isi ia doar o tigara din oricare pachet.
     * Mda, daca nu lasa un pachet gol in urma pentru el nu are farmec.
     *
     * S-a facut ora 15:00, deja intellij-ul lui Florin plange dupa o pauza, stim cu totii
     * ce urmeaza. Stiind exact cate tigari sunt in pachetul a si b, ajutati-l pe Florin
     * sa afle cu cate tigari va iesi pe terasa in urmatoarele 30 de secunde.
     *
     */

    public static int cutia_milei(int a, int b) {

    }


    /***
     * Gata cu cerintele lungi la probleme de 2 linii
     *
     * Trebuie sa construiti un array fib unde fib[i] reprezinta al i-lea termen din sirul fibonacci
     *
     * ADAUGATI cod in functia de mai jos, nu modificati nimic din ce e scris deja
     */
    public static List<Integer> fibonacci() {
        //fib[1] = 1, fib[2] = 1, fib[3] = 2, ...
        List<Integer> fib = new ArrayList<>();
        int n = 17;
        for(int i = 2; i <= n; ++i) {

        }
        return fib;
    }

    /***
     * Am glumit
     *
     *Astazi e 4 aprilie si Catalin, un parior inrait abia asteapta ziua de maine cand primeste salariul
     * si poate sa puna si el un bilet de ala sigur la pariuri.
     *
     * Catalin, desi nu a pierdut niciun pariu niciodata, mai intai isi pune deoparte banii pentru cheltuielile lunare si ramane cu X lei pe care ii poate paria.
     *
     * In data de 5 Aprilie, Catalin intra pe superbet, alege meciurile alea sigure cu cota totala 7 (cota lui
     * norocoasa) si sta pe spate pana a doua zi dimineata cand vede, deloc surprinzator, ca biletul a fost
     * castigator.
     *
     * Catalin, gasindu-si astfel scopul in viata de a pune bilete sigure si a inmulti bani mai repede
     * decat manelistii, decide ca in fiecare zi incepand din 6 Aprilie sa ia toti banii pe care i-a castigat
     * scos pe pariul din ziua trecuta (toti banii scosi, nu doar profitul) si sa ii parieze pe un bilet cu cota 7.
     *
     * Scrieti un program care pentru niste constante date X (banii pentru pariuri pe care ii primeste pe data de 5 aprilie)
     * si N (numarul de zile trecute din data de azi, adica 4 aprilie) afisaza o valoare V, banii pe care ii va avea
     * Catalin in buzunar, sau in contul de la superbet, la inceputul zilei N, inainte sa puna un nou bilet.
     *
     * Observatie: Catalin are card la BCR si primeste salarul exact la inceputul zilei de 5 aprilie (ziua 1).
     *
     * Restrictii:
     *
     * 1250 <= X <= 20000
     * 0 <= N <= 1000
     *
     * Exemplu:
     * X = 5
     * N = 3
     * resultat:
     * V = 245
     *
     * Teste:
     * X = 2340             X=2              X=200
     * N = 0                N=1              N=2
     * -------------------------------------------------
     * V = 0                V=2              V=1400
     *
     *
     */

    public static void cota_sigura(int x, int n) {

    }

    public static void main(String[] args) {
	// write your code here
    }
}
