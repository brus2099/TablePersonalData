   package fes.aragon.inicio;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fes.aragon.datos.Datos;
import fes.aragon.datos.TablaArchivoImpl;
import javafx.scene.control.ComboBox;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class EntradaDeDatos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JComboBox comboBox;
	private JComboBox comboBox1;
	private TablaArchivoImpl datos;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EntradaDeDatos dialog = new EntradaDeDatos(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EntradaDeDatos(final TablaArchivoImpl datos) {
		this.datos = datos;
		setModal(true);
		setBounds(100, 100, 450, 340);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.WEST);

		JLabel nombre = new JLabel("Nombre");

		textField = new JTextField();
		textField.setColumns(10);

		JLabel aPaterno = new JLabel("Apellido Paterno");

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		JLabel aMaterno = new JLabel("Apellido Materno");

		textField_2 = new JTextField();
		textField_2.setColumns(10);

		JLabel sexo = new JLabel("Sexo");

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Femenino", "Masculino" }));

		JLabel telefono = new JLabel("Telefono");

		textField_3 = new JTextField();
		textField_3.setColumns(10);

		JLabel codigoPostal = new JLabel("Codigo Postal");

		textField_4 = new JTextField();
		textField_4.setColumns(10);

		JLabel estCivil = new JLabel("Estado Civil");

		comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] { "Soltero", "Casado" }));

		JLabel direccion = new JLabel("Direccion");

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup().addGap(28).addGroup(gl_contentPanel
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(sexo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(aPaterno, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(aMaterno, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(nombre))
						.addComponent(telefono).addComponent(codigoPostal).addComponent(estCivil)
						.addComponent(direccion)).addGap(18)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
								.addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
										.addComponent(textField_3)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
												.addComponent(textField_2, 183, 183, Short.MAX_VALUE)
												.addComponent(textField_1, 183, 183, Short.MAX_VALUE)
												.addComponent(textField))))
						.addGap(481)));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPanel
				.createSequentialGroup().addGap(19)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(nombre).addComponent(
						textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(aPaterno).addComponent(
						textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(aMaterno).addComponent(
						textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING).addComponent(sexo).addComponent(
						comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING).addComponent(telefono).addComponent(
						textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPanel
						.createParallelGroup(Alignment.BASELINE).addComponent(codigoPostal).addComponent(textField_4,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(estCivil).addComponent(
						comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(direccion).addComponent(
						textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(31)));
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						// recuoerar los datos de JtextField
						// crear objeto Datos
						// agregar el objeto a Datos
						String nombre = textField.getText();
						String aPaterno= textField_1.getText();
						String aMaterno= textField_2.getText();
						String sexo= (String)comboBox.getSelectedItem();
						String estCivil = (String)comboBox1.getSelectedItem();
						String direccion = textField_5.getText();
						//System.out.println(sexo);
						String estCivi= (String) comboBox1.getSelectedItem();
						//System.out.println(estCivi);

						try {
							double telefono = Double.parseDouble(textField_3.getText());
							int codigoPos = Integer.parseInt(textField_4.getText());
							Datos dat = new Datos();
							dat.setNombre(nombre);
							dat.setaPaterno(aPaterno);
							dat.setaMaterno(aMaterno);
							dat.setSexo(sexo);
							dat.setTelefono(telefono);
							dat.setCodPostal(codigoPos);
							dat.setEstCivil(estCivil);
							dat.setDireccion(direccion);
							datos.getDatos().add(dat);
							datos.fireTableDataChanged();
							limpiar();

						} catch (NumberFormatException ex) {
							JOptionPane.showMessageDialog(null, "Error en la entrada de datos");
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	private void limpiar() {
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");

	}
}  