
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class logica {

    public void dibujar(int NumH, int NumE, int NumO, JPanel lienzo) {
        Graphics g = lienzo.getGraphics();
        PersonajeCreator ElfCreator = new PersonajeCreator("Elfo");
        PersonajeCreator HumCreator = new PersonajeCreator("Humano");
        PersonajeCreator OrcCreator = new PersonajeCreator("Orco");
        Personaje MatrizPers[][];
        int Sx = 0, Sy = 0;
        int n = 0, m = 0;
        int TImg = NumH + NumE + NumO;
        int contH = NumH, contE = NumE, contO = NumO, cont = TImg;
        if (TImg != 0) {
            if (TImg % 2 == 0) {
                n = (int) Math.ceil(Math.sqrt(((TImg * 3.0) / 4.0)));
                m = (int) Math.ceil((n * 4.0) / 3.0);

            } else {
                n = (int) Math.ceil(((Math.sqrt(((TImg * 3.0) / 4.0)))) + 1);
                m = (int) Math.ceil((n * 4.0) / 3.0);

            }

          
            MatrizPers = new Personaje[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (cont != 0) {
                        if (contE != 0) {
                            System.out.println("cont." + cont);
                            MatrizPers[i][j] = ElfCreator.retrievePersonaje();
                            contE--;
                        } else {
                            if (contH != 0) {
                                System.out.println("cont." + cont);
                                MatrizPers[i][j] = HumCreator.retrievePersonaje();
                                contH--;
                            } else {
                                if (contO != 0) {
                                    MatrizPers[i][j] = OrcCreator.retrievePersonaje();
                                    contO--;
                                }

                            }
                        }
                        cont--;
                    }
                }
            }
            Sx = (lienzo.getWidth() / m);
            Sy = (lienzo.getHeight() / n);
            DibujarCuadricula(lienzo,n,m,Sx,Sy);
            cont = TImg;
            for (int i = 0; i < m; i++) {
                for (int k = 0; k < n; k++) {
                    if (cont != 0) {
                        System.out.println("Dibujo." + cont);
                        g.drawImage(MatrizPers[i][k].getImgPersonaje().getImage(), i * Sx, k * Sy, Sx, Sy, null);
                        g.drawImage(MatrizPers[i][k].getImgArmadura().getImage(), i * Sx, k * Sy, Sx, Sy, null);
                        g.drawImage(MatrizPers[i][k].getImgArma().getImage(), i * Sx, k * Sy, Sx, Sy, null);
                        cont--;

                    } else {
                        g.setColor(lienzo.getBackground());
                        g.fillRect((i * Sx) + 1, k * Sy, Sx, Sy);
                    }
                }
            }

        }

    }

    public void DibujarCuadricula(JPanel lienzo,int n,int m,int Sx,int Sy) {
        Graphics g = lienzo.getGraphics();
        g.setColor(lienzo.getBackground());
            g.fillRect(0, 0, lienzo.getWidth() , lienzo.getHeight());
            g.setColor(Color.BLACK);
            for (int i = 0; i < m + 1; i++) {

                g.drawLine(i * Sx, 0, i * Sx, n * Sy);

            }
            for (int k = 0; k < n + 1; k++) {
                g.drawLine(0, k * Sy, m * Sx, k * Sy - 4);
            }

    }
}
