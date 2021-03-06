import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIPrincipal {

	private JFrame frmAdministradorDeAspirantes;
	private JTextField txtNombre;
	private JTextField txtDpi;
	private JTextField Supera80;
	private JTextField txtSino;
	private JComboBox comboBox;
	private JSpinner Sanio1;
	private JSpinner Sanio2;
	private JSpinner Sanio3;
	private JSpinner SMate;
	private JSpinner SLenguaje;
	private JSpinner SHistoria;
	private JSpinner SAptitud;
	private JButton btnIngresar;
	private JButton btnActualizar;
	private JButton btnVerificar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIPrincipal window = new GUIPrincipal();
					window.frmAdministradorDeAspirantes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdministradorDeAspirantes = new JFrame();
		frmAdministradorDeAspirantes.setTitle("Administrador de aspirantes");
		frmAdministradorDeAspirantes.setBounds(200, 200, 550, 400);
		frmAdministradorDeAspirantes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdministradorDeAspirantes.getContentPane().setLayout(new GridLayout(1, 2, 2, 2));
		
		JPanel panel = new JPanel();
		frmAdministradorDeAspirantes.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblIngresarNuevoAspirante = new JLabel("Ingresar nuevo aspirante");
		sl_panel.putConstraint(SpringLayout.NORTH, lblIngresarNuevoAspirante, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblIngresarNuevoAspirante, 20, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblIngresarNuevoAspirante, -307, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblIngresarNuevoAspirante, -301, SpringLayout.EAST, panel);
		panel.add(lblIngresarNuevoAspirante);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		sl_panel.putConstraint(SpringLayout.NORTH, verticalStrut, 0, SpringLayout.NORTH, lblIngresarNuevoAspirante);
		sl_panel.putConstraint(SpringLayout.WEST, verticalStrut, 24, SpringLayout.EAST, lblIngresarNuevoAspirante);
		sl_panel.putConstraint(SpringLayout.SOUTH, verticalStrut, -10, SpringLayout.SOUTH, panel);
		panel.add(verticalStrut);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		sl_panel.putConstraint(SpringLayout.SOUTH, btnIngresar, -21, SpringLayout.SOUTH, panel);
		panel.add(btnIngresar);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox, 3, SpringLayout.SOUTH, lblIngresarNuevoAspirante);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox, 30, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, comboBox, 26, SpringLayout.SOUTH, lblIngresarNuevoAspirante);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox, -10, SpringLayout.EAST, lblIngresarNuevoAspirante);
		panel.add(comboBox);
		
		JLabel lblDatos = new JLabel("Datos:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblDatos, 29, SpringLayout.SOUTH, lblIngresarNuevoAspirante);
		sl_panel.putConstraint(SpringLayout.WEST, lblDatos, 0, SpringLayout.WEST, lblIngresarNuevoAspirante);
		panel.add(lblDatos);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		sl_panel.putConstraint(SpringLayout.NORTH, txtNombre, 6, SpringLayout.SOUTH, lblDatos);
		sl_panel.putConstraint(SpringLayout.WEST, txtNombre, 0, SpringLayout.WEST, lblIngresarNuevoAspirante);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDpi = new JTextField();
		sl_panel.putConstraint(SpringLayout.WEST, btnIngresar, 0, SpringLayout.WEST, txtDpi);
		txtDpi.setText("DPI");
		sl_panel.putConstraint(SpringLayout.SOUTH, txtDpi, 0, SpringLayout.SOUTH, txtNombre);
		sl_panel.putConstraint(SpringLayout.EAST, txtDpi, -25, SpringLayout.WEST, verticalStrut);
		panel.add(txtDpi);
		txtDpi.setColumns(10);
		
		JLabel lblNotasDeAos = new JLabel("Notas de a\u00F1os anteriores:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNotasDeAos, 6, SpringLayout.SOUTH, txtNombre);
		sl_panel.putConstraint(SpringLayout.WEST, lblNotasDeAos, 0, SpringLayout.WEST, lblIngresarNuevoAspirante);
		panel.add(lblNotasDeAos);
		
		Sanio1 = new JSpinner();
		Sanio1.setModel(new SpinnerNumberModel(new Float(0), new Float(0), new Float(100), new Float(1)));
		sl_panel.putConstraint(SpringLayout.NORTH, Sanio1, 6, SpringLayout.SOUTH, lblNotasDeAos);
		sl_panel.putConstraint(SpringLayout.WEST, Sanio1, 0, SpringLayout.WEST, lblIngresarNuevoAspirante);
		panel.add(Sanio1);
		
		Sanio2 = new JSpinner();
		Sanio2.setModel(new SpinnerNumberModel(new Float(0), new Float(0), new Float(100), new Float(1)));
		sl_panel.putConstraint(SpringLayout.NORTH, Sanio2, 6, SpringLayout.SOUTH, lblNotasDeAos);
		sl_panel.putConstraint(SpringLayout.WEST, Sanio2, 28, SpringLayout.EAST, Sanio1);
		panel.add(Sanio2);
		
		Sanio3 = new JSpinner();
		sl_panel.putConstraint(SpringLayout.WEST, Sanio3, 24, SpringLayout.EAST, Sanio2);
		Sanio3.setModel(new SpinnerNumberModel(new Float(0), new Float(0), new Float(100), new Float(1)));
		sl_panel.putConstraint(SpringLayout.NORTH, Sanio3, 0, SpringLayout.NORTH, Sanio1);
		panel.add(Sanio3);
		
		JLabel lblNotasDeExamenes = new JLabel("Notas de examenes:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNotasDeExamenes, 17, SpringLayout.SOUTH, Sanio1);
		sl_panel.putConstraint(SpringLayout.WEST, lblNotasDeExamenes, 0, SpringLayout.WEST, lblIngresarNuevoAspirante);
		panel.add(lblNotasDeExamenes);
		
		SMate = new JSpinner();
		sl_panel.putConstraint(SpringLayout.NORTH, SMate, 37, SpringLayout.SOUTH, lblNotasDeExamenes);
		sl_panel.putConstraint(SpringLayout.WEST, SMate, 0, SpringLayout.WEST, lblIngresarNuevoAspirante);
		SMate.setModel(new SpinnerNumberModel(new Float(0), new Float(0), new Float(100), new Float(1)));
		panel.add(SMate);
		
		JLabel lblMatemticas = new JLabel("Matem\u00E1ticas");
		sl_panel.putConstraint(SpringLayout.WEST, lblMatemticas, 0, SpringLayout.WEST, lblIngresarNuevoAspirante);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblMatemticas, -6, SpringLayout.NORTH, SMate);
		panel.add(lblMatemticas);
		
		JLabel lblLenguaje = new JLabel("Lenguaje");
		sl_panel.putConstraint(SpringLayout.NORTH, lblLenguaje, 0, SpringLayout.NORTH, lblMatemticas);
		sl_panel.putConstraint(SpringLayout.WEST, lblLenguaje, 36, SpringLayout.EAST, lblMatemticas);
		panel.add(lblLenguaje);
		
		SLenguaje = new JSpinner();
		sl_panel.putConstraint(SpringLayout.NORTH, SLenguaje, 0, SpringLayout.NORTH, SMate);
		sl_panel.putConstraint(SpringLayout.EAST, SLenguaje, 0, SpringLayout.EAST, lblLenguaje);
		SLenguaje.setModel(new SpinnerNumberModel(new Float(0), new Float(0), new Float(100), new Float(1)));
		panel.add(SLenguaje);
		
		JLabel lblHistoria = new JLabel("Historia");
		sl_panel.putConstraint(SpringLayout.EAST, lblHistoria, 0, SpringLayout.EAST, lblIngresarNuevoAspirante);
		panel.add(lblHistoria);
		
		SHistoria = new JSpinner();
		sl_panel.putConstraint(SpringLayout.SOUTH, lblHistoria, -7, SpringLayout.NORTH, SHistoria);
		sl_panel.putConstraint(SpringLayout.NORTH, SHistoria, 0, SpringLayout.NORTH, SMate);
		sl_panel.putConstraint(SpringLayout.EAST, SHistoria, 0, SpringLayout.EAST, lblIngresarNuevoAspirante);
		SHistoria.setModel(new SpinnerNumberModel(new Float(0), new Float(0), new Float(100), new Float(1)));
		panel.add(SHistoria);
		
		JLabel lblExamenDeAptitudes = new JLabel("Examen de Aptitudes");
		sl_panel.putConstraint(SpringLayout.EAST, lblExamenDeAptitudes, 0, SpringLayout.EAST, lblNotasDeExamenes);
		panel.add(lblExamenDeAptitudes);
		
		SAptitud = new JSpinner();
		sl_panel.putConstraint(SpringLayout.NORTH, SAptitud, 14, SpringLayout.SOUTH, SLenguaje);
		sl_panel.putConstraint(SpringLayout.WEST, SAptitud, 32, SpringLayout.EAST, lblExamenDeAptitudes);
		sl_panel.putConstraint(SpringLayout.NORTH, lblExamenDeAptitudes, 3, SpringLayout.NORTH, SAptitud);
		SAptitud.setModel(new SpinnerNumberModel(new Float(0), new Float(0), new Float(100), new Float(1)));
		panel.add(SAptitud);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		panel.add(separator);
		
		JLabel lblListadoDeAspirantes = new JLabel("Listado de aspirantes");
		sl_panel.putConstraint(SpringLayout.NORTH, lblListadoDeAspirantes, 25, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblListadoDeAspirantes, 24, SpringLayout.EAST, verticalStrut);
		panel.add(lblListadoDeAspirantes);
		
		JTextPane textPane = new JTextPane();
		sl_panel.putConstraint(SpringLayout.WEST, textPane, 287, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, verticalStrut, -6, SpringLayout.WEST, textPane);
		sl_panel.putConstraint(SpringLayout.NORTH, textPane, 18, SpringLayout.SOUTH, lblListadoDeAspirantes);
		sl_panel.putConstraint(SpringLayout.SOUTH, textPane, 6, SpringLayout.SOUTH, lblNotasDeExamenes);
		sl_panel.putConstraint(SpringLayout.EAST, textPane, -43, SpringLayout.EAST, panel);
		textPane.setEditable(false);
		panel.add(textPane);
		
		Supera80 = new JTextField();
		Supera80.setEditable(false);
		Supera80.setText("\u00BFEl 50% de los estudiantes supera 80?");
		sl_panel.putConstraint(SpringLayout.NORTH, Supera80, 7, SpringLayout.SOUTH, textPane);
		sl_panel.putConstraint(SpringLayout.WEST, Supera80, 6, SpringLayout.EAST, verticalStrut);
		sl_panel.putConstraint(SpringLayout.EAST, Supera80, 0, SpringLayout.EAST, textPane);
		panel.add(Supera80);
		Supera80.setColumns(10);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sl_panel.putConstraint(SpringLayout.NORTH, btnActualizar, 12, SpringLayout.SOUTH, Supera80);
		sl_panel.putConstraint(SpringLayout.EAST, btnActualizar, 0, SpringLayout.EAST, textPane);
		panel.add(btnActualizar);
		
		btnVerificar = new JButton("Verificar");
		sl_panel.putConstraint(SpringLayout.WEST, btnVerificar, 24, SpringLayout.EAST, verticalStrut);
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnVerificar);
		
		txtSino = new JTextField();
		sl_panel.putConstraint(SpringLayout.EAST, btnVerificar, -27, SpringLayout.WEST, txtSino);
		sl_panel.putConstraint(SpringLayout.NORTH, txtSino, 1, SpringLayout.NORTH, btnVerificar);
		sl_panel.putConstraint(SpringLayout.EAST, txtSino, 0, SpringLayout.EAST, textPane);
		txtSino.setEditable(false);
		txtSino.setText("Si/No");
		panel.add(txtSino);
		txtSino.setColumns(10);
		
		JLabel lblPromedioASuperar = new JLabel("Promedio a superar:");
		sl_panel.putConstraint(SpringLayout.NORTH, lblPromedioASuperar, 44, SpringLayout.SOUTH, Supera80);
		sl_panel.putConstraint(SpringLayout.NORTH, btnVerificar, 6, SpringLayout.SOUTH, lblPromedioASuperar);
		sl_panel.putConstraint(SpringLayout.WEST, lblPromedioASuperar, 0, SpringLayout.WEST, lblListadoDeAspirantes);
		panel.add(lblPromedioASuperar);
		
		JSpinner SSuperar = new JSpinner();
		sl_panel.putConstraint(SpringLayout.NORTH, SSuperar, 6, SpringLayout.SOUTH, btnActualizar);
		SSuperar.setModel(new SpinnerNumberModel(new Float(0), new Float(0), new Float(100), new Float(1)));
		sl_panel.putConstraint(SpringLayout.EAST, SSuperar, 0, SpringLayout.EAST, textPane);
		panel.add(SSuperar);
	}
	public JComboBox getComboBox() {
		return comboBox;
	}
	public JTextField getTxtNombre() {
		return txtNombre;
	}
	public JTextField getTxtDpi() {
		return txtDpi;
	}
	public JSpinner getSanio1() {
		return Sanio1;
	}
	public JSpinner getSanio2() {
		return Sanio2;
	}
	public JSpinner getSanio3() {
		return Sanio3;
	}
	public JSpinner getSMate() {
		return SMate;
	}
	public JSpinner getSLenguaje() {
		return SLenguaje;
	}
	public JSpinner getSHistoria() {
		return SHistoria;
	}
	public JSpinner getSAptitud() {
		return SAptitud;
	}
	public JButton getBtnIngresar() {
		return btnIngresar;
	}
	public JTextField getSupera80() {
		return Supera80;
	}
	public JButton getBtnActualizar() {
		return btnActualizar;
	}
	
	
	public JButton getBtnVerificar() {
		return btnVerificar;
	}
	public JTextField getTxtSino() {
		return txtSino;
	}
}
