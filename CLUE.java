package clue;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Map;
import javax.swing.*;
import org.jpl7.Query;
import org.jpl7.Term;
public final class CLUE extends JFrame {
    JPanel panel1;
    JButton botonSospecha;
    int i = 8;

    public CLUE() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("CLUE");
        setBounds(180, 120, 1300, 800);
        portada();
        botones();
    }

    public void portada() {
        panel1 = new JPanel();
        panel1.setBackground(Color.DARK_GRAY);
        panel1.setBounds(0, 0, 1300, 1000);
        panel1.setLayout(null);
        add(panel1);
    }

    public void botones() {
        JLabel labelSospechoso = new JLabel("Seleccione un sospechoso:");
        labelSospechoso.setForeground(Color.WHITE);
        labelSospechoso.setBounds(10, 20, 200, 30);
        panel1.add(labelSospechoso);

        JRadioButton rbtn1 = new JRadioButton("Coronel Mostaza", false);
        JRadioButton rbtn2 = new JRadioButton("Senorita Escarlata", false);
        JRadioButton rbtn3 = new JRadioButton("Profesor Ciruela", false);
        JRadioButton rbtn4 = new JRadioButton("Senora Pavo Real", false);
        JRadioButton rbtn5 = new JRadioButton("Senora White", false);
        JRadioButton rbtn6 = new JRadioButton("Reverendo Verde", false);

        rbtn1.setBounds(10, 60, 200, 30);
        rbtn2.setBounds(10, 140, 200, 30);
        rbtn3.setBounds(10, 220, 200, 30);
        rbtn4.setBounds(10, 300, 200, 30);
        rbtn5.setBounds(10, 380, 200, 30);
        rbtn6.setBounds(10, 460, 200, 30);
        panel1.add(rbtn1);
        panel1.add(rbtn2);
        panel1.add(rbtn3);
        panel1.add(rbtn4);
        panel1.add(rbtn5);
        panel1.add(rbtn6);

        ButtonGroup grupoSospechosos = new ButtonGroup();
        grupoSospechosos.add(rbtn1);
        grupoSospechosos.add(rbtn2);
        grupoSospechosos.add(rbtn3);
        grupoSospechosos.add(rbtn4);
        grupoSospechosos.add(rbtn5);
        grupoSospechosos.add(rbtn6);

        addImageToPanel(panel1, "coronel.jpeg", 220, 45, 90, 75);
        addImageToPanel(panel1, "escarlata.jpg", 220, 140, 90, 75);
        addImageToPanel(panel1, "profesor.jpg", 220, 220, 90, 75);
        addImageToPanel(panel1, "pavo.jpg", 220, 300, 90, 75);
        addImageToPanel(panel1, "blanco.jpg", 220, 380, 90, 75);
        addImageToPanel(panel1, "verde.jpg", 220, 460, 90, 75);

        JLabel labelArma = new JLabel("Seleccione un arma:");
        labelArma.setForeground(Color.WHITE);
        labelArma.setBounds(340, 20, 200, 30);
        panel1.add(labelArma);

        JRadioButton armbtn1 = new JRadioButton("Candelero", false);
        JRadioButton armbtn2 = new JRadioButton("Daga", false);
        JRadioButton armbtn3 = new JRadioButton("Tuberia de Plomo", false);
        JRadioButton armbtn4 = new JRadioButton("Revolver", false);
        JRadioButton armbtn5 = new JRadioButton("Soga", false);
        JRadioButton armbtn6 = new JRadioButton("Llave", false);

        armbtn1.setBounds(340, 60, 200, 30);
        armbtn2.setBounds(340, 140, 200, 30);
        armbtn3.setBounds(340, 220, 200, 30);
        armbtn4.setBounds(340, 300, 200, 30);
        armbtn5.setBounds(340, 380, 200, 30);
        armbtn6.setBounds(340, 460, 200, 30);
        panel1.add(armbtn1);
        panel1.add(armbtn2);
        panel1.add(armbtn3);
        panel1.add(armbtn4);
        panel1.add(armbtn5);
        panel1.add(armbtn6);

        ButtonGroup grupoArmas = new ButtonGroup();
        grupoArmas.add(armbtn1);
        grupoArmas.add(armbtn2);
        grupoArmas.add(armbtn3);
        grupoArmas.add(armbtn4);
        grupoArmas.add(armbtn5);
        grupoArmas.add(armbtn6);

        addImageToPanel(panel1, "candelero.jpg", 550, 35, 90, 75);
        addImageToPanel(panel1, "daga.jpg", 550, 135, 90, 60);
        addImageToPanel(panel1, "tuberia.jpg", 550, 220, 90, 60);
        addImageToPanel(panel1, "revolver.jpg", 550, 305, 90, 60);
        addImageToPanel(panel1, "soga.jpg", 550, 385, 90, 60);
        addImageToPanel(panel1, "llave.jpg", 550, 460, 90, 60);

        JLabel labelCuarto = new JLabel("Seleccione un cuarto:");
        labelCuarto.setForeground(Color.WHITE);
        labelCuarto.setBounds(700, 20, 200, 30);
        panel1.add(labelCuarto);

        JRadioButton cuartobtn1 = new JRadioButton("Vestibulo", false);
        JRadioButton cuartobtn2 = new JRadioButton("Salon", false);
        JRadioButton cuartobtn3 = new JRadioButton("Comedor", false);
        JRadioButton cuartobtn4 = new JRadioButton("Cocina", false);
        JRadioButton cuartobtn5 = new JRadioButton("Salon de baile", false);
        JRadioButton cuartobtn6 = new JRadioButton("Sala de billar", false);
        JRadioButton cuartobtn7 = new JRadioButton("Biblioteca", false);
        JRadioButton cuartobtn8 = new JRadioButton("Estudio", false);

        cuartobtn1.setBounds(700, 60, 200, 30);
        cuartobtn2.setBounds(700, 140, 200, 30);
        cuartobtn3.setBounds(700, 220, 200, 30);
        cuartobtn4.setBounds(700, 300, 200, 30);
        cuartobtn5.setBounds(700, 380, 200, 30);
        cuartobtn6.setBounds(700, 460, 200, 30);
        cuartobtn7.setBounds(700, 540, 200, 30);
        cuartobtn8.setBounds(700, 620, 200, 30);
        panel1.add(cuartobtn1);
        panel1.add(cuartobtn2);
        panel1.add(cuartobtn3);
        panel1.add(cuartobtn4);
        panel1.add(cuartobtn5);
        panel1.add(cuartobtn6);
        panel1.add(cuartobtn7);
        panel1.add(cuartobtn8);

        ButtonGroup grupoCuartos = new ButtonGroup();
        grupoCuartos.add(cuartobtn1);
        grupoCuartos.add(cuartobtn2);
        grupoCuartos.add(cuartobtn3);
        grupoCuartos.add(cuartobtn4);
        grupoCuartos.add(cuartobtn5);
        grupoCuartos.add(cuartobtn6);
        grupoCuartos.add(cuartobtn7);
        grupoCuartos.add(cuartobtn8);

        addImageToPanel(panel1, "vestibulo.png", 920, 35, 90, 75);
        addImageToPanel(panel1, "salon.png", 920, 135, 90, 75);
        addImageToPanel(panel1, "comedor.png", 920, 220, 90, 75);
        addImageToPanel(panel1, "cocina.png", 920, 305, 90, 75);
        addImageToPanel(panel1, "baile.png", 920, 385, 90, 75);
        addImageToPanel(panel1, "billar.png", 920, 465, 90, 75);
        addImageToPanel(panel1, "biblio.png", 920, 545, 90, 75);
        addImageToPanel(panel1, "estudio.png", 920, 625, 90, 75);

        botonSospecha = new JButton("Sospechar");
        botonSospecha.setBounds(10, 520, 100, 30);
        botonSospecha.addActionListener((ActionEvent e) -> {
            String archivo = "consult('/home/river/file1.pl')";
            Query loadQ = new Query(archivo);
            if(!loadQ.hasSolution()){
                JOptionPane.showMessageDialog(null, "Error al cargar el archivo");
                return;
            }
            String c = "";
            String d = "";
            String h = "";
            if (rbtn1.isSelected()) {
                c = rbtn1.getText();
                System.out.println("Coronel Mostaza");
            } else if (rbtn2.isSelected()) {
                c = rbtn2.getText();
                System.out.println("Senorita Escarlata");
            } else if (rbtn3.isSelected()) {
                c = rbtn3.getText();
                System.out.println("Profesor Ciruela");
            } else if (rbtn4.isSelected()) {
                c = rbtn4.getText();
                System.out.println("Senora Pavo Real");
            } else if (rbtn5.isSelected()) {
                c = rbtn5.getText();
                System.out.println("Senora White");
            } else if (rbtn6.isSelected()) {
                c = rbtn6.getText();
                System.out.println("Reverendo Verde");
            } else {
                JOptionPane.showMessageDialog(null, "No se ingresó ningún sospechoso");
                return;
            }
            
            if (armbtn1.isSelected()) {
                d = armbtn1.getText();
                System.out.println("Candelero");
            } else if (armbtn2.isSelected()) {
                d = armbtn2.getText();
                System.out.println("Daga");
            } else if (armbtn3.isSelected()) {
                d = armbtn3.getText();
                System.out.println("Tuberia de Plomo");
            } else if (armbtn4.isSelected()) {
                d = armbtn4.getText();
                System.out.println("Revolver");
            } else if (armbtn5.isSelected()) {
                d = armbtn5.getText();
                System.out.println("Soga");
            } else if (armbtn6.isSelected()) {
                d = armbtn6.getText();
                System.out.println("Llave");
            } else {
                JOptionPane.showMessageDialog(null, "No se ingresó ninguna arma");
                return;
            }
            
            if (cuartobtn1.isSelected()) {
                h = cuartobtn1.getText();
                System.out.println("Vestibulo");
            } else if (cuartobtn2.isSelected()) {
                h = cuartobtn2.getText();
                System.out.println("Salon");
            } else if (cuartobtn3.isSelected()) {
                h = cuartobtn3.getText();
                System.out.println("Comedor");
            } else if (cuartobtn4.isSelected()) {
                h = cuartobtn4.getText();
                System.out.println("Cocina");
            } else if (cuartobtn5.isSelected()) {
                h = cuartobtn5.getText();
                System.out.println("Salon de baile");
            } else if (cuartobtn6.isSelected()) {
                h = cuartobtn6.getText();
                System.out.println("Sala de billar");
            } else if (cuartobtn7.isSelected()) {
                h = cuartobtn7.getText();
                System.out.println("Biblioteca");
            } else if (cuartobtn8.isSelected()) {
                h = cuartobtn8.getText();
                System.out.println("Estudio");
            } else {
                JOptionPane.showMessageDialog(null, "No se ingresó ningún cuarto");
                return;
            }
            String ab  = "sospechar('"+c+"','"+d+"','"+h+"')";
            
            Query a = new Query(ab);
            System.out.println("Executing query: " + ab);
            if(a.hasSolution()){
                JOptionPane.showMessageDialog(null, "Adivinaste, felicidades :3");
                System.exit(0);
            }else{
                JOptionPane.showMessageDialog(null, "Incorrecto, te quedan: "+i+" intentos");
                i--;
                if(i<0){
                    String conP = "sospechar(SOS,ARM,HAB)";
                    Query p = new Query(conP);
                    p.hasSolution();
                    
                    String arma;
                    String asesino;
                    String habitacion;
                    
                    Map<String, Term> caso = p.oneSolution();
                    asesino = caso.get("SOS").toString();
                    arma= caso.get("ARM").toString();
                    habitacion = caso.get("HAB").toString();
                    JOptionPane.showMessageDialog(null, "Se acabaron los intentos, intentalo a la proxima, el correcto era: Asesino: "+asesino+ ", arma: "+arma+" habitacion: "+habitacion);
                    System.exit(0);
                }
            }
        });
        panel1.add(botonSospecha);
    }
    private void addImageToPanel(JPanel panel, String imagePath, int x, int y, int width, int height) {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(imagePath));
        Image image = imageIcon.getImage();
        Image newImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(newImage);
        JLabel imageLabel = new JLabel(scaledImageIcon);
        imageLabel.setBounds(x, y, width, height);
        panel.add(imageLabel);
    }
   
}
