package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.copiadora.Xerox;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Scanner scanner = new Scanner();
        Xerox xerox = new Xerox();
        Deskjet deskjet = new Deskjet();
        Laserjet laserjet = new Laserjet();

        Impressora impressora = deskjet;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = xerox;


        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
        em.copiar();
    }
}
