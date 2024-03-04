/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package shop;
import ShopDao.conexionDB;
import ShopDao.int_usuarioDaoImp;
import ShopDao.int_usuario;
import com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkHardIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.Color;
import java.sql.Connection;
import java.util.Arrays;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author ajota
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    int xMouse, yMouse;
    public login() {
        initComponents();
        Locale.setDefault(new Locale("es", "ES"));
        this.setLocationRelativeTo(null); //Centrar la pantalla
    }
    public static Connection conn;
    public static int user_id;
    public static String username;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fdbg = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        pass = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtp_contraseña = new javax.swing.JPasswordField();
        cambiar_pass = new javax.swing.JCheckBox();
        boton_entrar = new javax.swing.JPanel();
        btn_entrar = new javax.swing.JLabel();
        barra_superior = new javax.swing.JPanel();
        btnmin = new javax.swing.JPanel();
        lbl_min = new javax.swing.JLabel();
        exitbtn = new javax.swing.JPanel();
        lbl_salir = new javax.swing.JLabel();
        lbl_nocuenta = new javax.swing.JLabel();
        lbl_cuenta_nueva = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fdbg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fdbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        fdbg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(fdbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 330, 160));

        nombre.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 204, 51));
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setText("SHOP ONLINE PLUS");
        nombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 330, 30));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.jpg"))); // NOI18N
        logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 330, 500));

        titulo.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("INICIAR SESIÓN");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        user.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        user.setText("USUARIO");
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        txt_usuario.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(153, 153, 153));
        txt_usuario.setText("Ingrese su nombre de usuario ");
        txt_usuario.setBorder(null);
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_usuarioMousePressed(evt);
            }
        });
        jPanel1.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 390, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 390, 10));

        pass.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        pass.setText("CONTRASEÑA");
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 390, 10));

        txtp_contraseña.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtp_contraseña.setForeground(new java.awt.Color(153, 153, 153));
        txtp_contraseña.setText("********");
        txtp_contraseña.setBorder(null);
        txtp_contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtp_contraseñaMousePressed(evt);
            }
        });
        jPanel1.add(txtp_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 390, 30));

        cambiar_pass.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cambiar_pass.setText("Mostrar contraseña");
        cambiar_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiar_passActionPerformed(evt);
            }
        });
        jPanel1.add(cambiar_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        boton_entrar.setBackground(new java.awt.Color(13, 25, 75));

        btn_entrar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btn_entrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_entrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_entrar.setText("ENTRAR");
        btn_entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_entrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_entrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_entrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout boton_entrarLayout = new javax.swing.GroupLayout(boton_entrar);
        boton_entrar.setLayout(boton_entrarLayout);
        boton_entrarLayout.setHorizontalGroup(
            boton_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_entrar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        boton_entrarLayout.setVerticalGroup(
            boton_entrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boton_entrarLayout.createSequentialGroup()
                .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(boton_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 130, 40));

        barra_superior.setBackground(new java.awt.Color(255, 255, 255));
        barra_superior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barra_superiorMouseDragged(evt);
            }
        });
        barra_superior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barra_superiorMousePressed(evt);
            }
        });

        btnmin.setBackground(new java.awt.Color(255, 255, 255));

        lbl_min.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_min.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_min.setText("-");
        lbl_min.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_minMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_minMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnminLayout = new javax.swing.GroupLayout(btnmin);
        btnmin.setLayout(btnminLayout);
        btnminLayout.setHorizontalGroup(
            btnminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_min, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnminLayout.setVerticalGroup(
            btnminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_min, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        exitbtn.setBackground(new java.awt.Color(255, 255, 255));

        lbl_salir.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_salir.setText("X");
        lbl_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_salirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitbtnLayout = new javax.swing.GroupLayout(exitbtn);
        exitbtn.setLayout(exitbtnLayout);
        exitbtnLayout.setHorizontalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitbtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitbtnLayout.setVerticalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout barra_superiorLayout = new javax.swing.GroupLayout(barra_superior);
        barra_superior.setLayout(barra_superiorLayout);
        barra_superiorLayout.setHorizontalGroup(
            barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barra_superiorLayout.createSequentialGroup()
                .addComponent(btnmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 728, Short.MAX_VALUE))
        );
        barra_superiorLayout.setVerticalGroup(
            barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(exitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(barra_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        lbl_nocuenta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbl_nocuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nocuenta.setText("¿No tiene una cuenta?");
        jPanel1.add(lbl_nocuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        lbl_cuenta_nueva.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lbl_cuenta_nueva.setForeground(new java.awt.Color(51, 51, 255));
        lbl_cuenta_nueva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_cuenta_nueva.setText("Crea una cuenta");
        lbl_cuenta_nueva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_cuenta_nueva.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_cuenta_nueva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cuenta_nuevaMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_cuenta_nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 110, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
        if (txt_usuario.getText().equals("Ingrese su nombre de usuario ")){
            txt_usuario.setText("");
            txt_usuario.setForeground(Color.black);
        }
        if (String.valueOf(txtp_contraseña.getPassword()).isEmpty()){
            txtp_contraseña.setText("********");
            txtp_contraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_usuarioMousePressed

    private void txtp_contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtp_contraseñaMousePressed
        if (String.valueOf(txtp_contraseña.getPassword()).equals("********")){
            txtp_contraseña.setText("");
            txtp_contraseña.setForeground(Color.black);
        }
        if (txt_usuario.getText().isEmpty()){
            txt_usuario.setText("Ingrese su nombre de usuario ");
            txt_usuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtp_contraseñaMousePressed

    private void cambiar_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiar_passActionPerformed
        if (cambiar_pass.isSelected()) {
            txtp_contraseña.setEchoChar((char) 0); // Mostrar la contraseña
        } else {
            txtp_contraseña.setEchoChar('*'); // Ocultar la contraseña
        }
    }//GEN-LAST:event_cambiar_passActionPerformed

    private void btn_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entrarMouseClicked

        // Se establece la conexión con la base de datos al hacer clic en el botón "Entrar"
        conexionDB conexion = new conexionDB();
        conn = conexion.establecerConexion();

        try {
            // Se obtienen los datos ingresados por el usuario
            username = txt_usuario.getText();
            
            String password = new String(txtp_contraseña.getPassword());

            // Verificar que los campos no estén vacíos y no contengan el texto por defecto
            if (username.isEmpty() || username.equals("Ingrese su nombre de usuario ")) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un nombre de usuario válido.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Salir del método si hay un error
            }

            if (password.isEmpty() || Arrays.equals(txtp_contraseña.getPassword(), "********".toCharArray())) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese una contraseña válida.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Salir del método si hay un error
            }

            // Determina si el usuario ingresó un nombre+apellido o un email
            boolean isNameSearch = !username.contains("@");

            // Crea la instancia de la implementación de la interfaz DAO
            int_usuarioDaoImp intUsuariosDAO = new int_usuarioDaoImp(conn);

            // Llama al método correspondiente de la interfaz DAO para obtener el usuario
            int_usuario usuario;

            if (isNameSearch) {
                // Si es una búsqueda por usuario y contraseña
                usuario = intUsuariosDAO.getUserByNameAndPass(username, password);

            } else {
                // Si es una búsqueda por email, utiliza el email directamente
                usuario = intUsuariosDAO.getUserByEmailAndPass(username, password);
            }

            // Verifica si el usuario existe y si la contraseña es correcta
            if (usuario != null) {
                // Inicia sesión y redirige al usuario a la pantalla principal
                app_shop shop = new app_shop();
                shop.setVisible(true);
                dispose();
            } else {
                // Muestra un mensaje de error al usuario
                JOptionPane.showMessageDialog(this, "Nombre de usuario o contraseña incorrecta.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            user_id = usuario.getId();
            String cadena = Integer.toString(user_id);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btn_entrarMouseClicked

    private void btn_entrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entrarMouseEntered
        boton_entrar.setBackground(new Color(69,81,107));
    }//GEN-LAST:event_btn_entrarMouseEntered

    private void btn_entrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_entrarMouseExited
        boton_entrar.setBackground(new Color(13,25,75));
    }//GEN-LAST:event_btn_entrarMouseExited

    private void lbl_minMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lbl_minMouseClicked

    private void lbl_minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minMouseEntered
        btnmin.setBackground(Color.red);
        lbl_min.setForeground(Color.white);
    }//GEN-LAST:event_lbl_minMouseEntered

    private void lbl_minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_minMouseExited
        btnmin.setBackground(Color.white);
        lbl_min.setForeground(Color.black);
    }//GEN-LAST:event_lbl_minMouseExited

    private void lbl_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_salirMouseClicked
        Object[] opciones = {"Sí", "No"};

        int respuesta = JOptionPane.showOptionDialog(
            this,
            "¿Estás seguro de cerrar la aplicación?",
            "Confirmar cierre",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]); // Puedes cambiar este índice para establecer el botón predeterminado

        if (respuesta == JOptionPane.YES_OPTION) {
            // Si el usuario elige "Sí", cierra la aplicación
            System.exit(0);
        } else {
            // Si el usuario elige "No" o cierra el cuadro de diálogo, no hace nada
        }
    }//GEN-LAST:event_lbl_salirMouseClicked

    private void lbl_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_salirMouseEntered
        exitbtn.setBackground(Color.red);
        lbl_salir.setForeground(Color.white);
    }//GEN-LAST:event_lbl_salirMouseEntered

    private void lbl_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_salirMouseExited
        exitbtn.setBackground(Color.white);
        lbl_salir.setForeground(Color.black);
    }//GEN-LAST:event_lbl_salirMouseExited

    private void barra_superiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barra_superiorMouseDragged

    private void barra_superiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barra_superiorMousePressed

    private void lbl_cuenta_nuevaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cuenta_nuevaMouseClicked
        // Cierra la ventana actual
        this.dispose();

        // Abre una nueva ventana de Registro
        Registro registro = new Registro();
        registro.setVisible(true);
    }//GEN-LAST:event_lbl_cuenta_nuevaMouseClicked
    public Connection getConn() {
        return conn;
    }
    public String getUser(){
        return username;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
            //FlatGruvboxDarkHardIJTheme.setup();
            FlatMaterialLighterIJTheme.setup();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barra_superior;
    private javax.swing.JPanel boton_entrar;
    private javax.swing.JLabel btn_entrar;
    private javax.swing.JPanel btnmin;
    private javax.swing.JCheckBox cambiar_pass;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JLabel fdbg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_cuenta_nueva;
    private javax.swing.JLabel lbl_min;
    private javax.swing.JLabel lbl_nocuenta;
    private javax.swing.JLabel lbl_salir;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txt_usuario;
    private javax.swing.JPasswordField txtp_contraseña;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}