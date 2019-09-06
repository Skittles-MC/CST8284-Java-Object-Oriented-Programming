
/**
 * File Name:       	GUICompanyClass.java
 * Author:          	Martin Choy 040835431
 * Course:          	CST8284 Java Object Oriented Programming, Lab Section: 314
 * Assignment:      	2
 * Assignment Title:	COMPANY MANAGEMENT TOOL PROTOTYPE V1.2
 * Due Date:        	Sunday, March 31 2019
 * Professor:       	Jason Mombourquette
 * Method list:      	getName(),getEmployeeNumber(),getStartDate(),getSalary(),setName(),setEmployeeNumber(),setStartDate(),setSalary()
 * 						toString(), loadExtraInfo()   
 * Special notes:		Removed all includes since prof doesn't want packages                       
 */

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;

public class GUICompanyConsole extends JFrame {
	private static final long serialVersionUID = 1L;
	private static int screenX, screenY;
	private Company startUp;

	public static void main(String[] args) {

		Toolkit tk = Toolkit.getDefaultToolkit(); // get handle to AWT
		Dimension screenSize = tk.getScreenSize(); // get the screensize from Toolkit
		screenX = (int) screenSize.getWidth() / 2;
		screenY = (int) screenSize.getHeight() / 2;
		new GUICompanyConsole().new LoadJFrame();

	}

	private class GBAssist extends GridBagConstraints {
		public GBAssist() {
			gridx = 0;
			gridy = 0;
		}

		public GBAssist setGrid(int x, int y, Dimension d) {
			gridx = x;
			gridy = y;
			gridwidth = (int) d.getWidth();
			gridheight = (int) d.getHeight();
			return this;
		}
	}

	public class LoadJFrame extends JFrame {

		private static final long serialVersionUID = 1L;
		private JButton addManagerEmployeeBtn = new JButton("Add New Manager"),
				addStaffEmployeeBtn = new JButton("Add New Staff"),
				addTempEmployeeBtn = new JButton("Add New Temp Employee"),
				deleteEmployeeBtn = new JButton("Delete Current Employee"),
				findEmployeeBtn = new JButton("Find Employee"), nextEmployeeBtn = new JButton("Next Employee"),
				previousEmployeeBtn = new JButton("Previous Employee"),
				saveToFileBtn = new JButton("Save Employees to File"),
				loadFromFileBtn = new JButton("Load Employees from File");

		private JLabel empName = new JLabel("Name"), empNumber = new JLabel("Number"),
				empStartDate = new JLabel("Start Date"), empSalary = new JLabel("Salary"),
				empExtraInfo = new JLabel("Special Information");

		private JTextArea txtName = new JTextArea(""), txtNumber = new JTextArea(""), txtStartDate = new JTextArea(""),
				txtSalary = new JTextArea(""), txtExtraInfo = new JTextArea("");

		private JPanel empPanel = new JPanel(), fileIOPanel = new JPanel(), empInfoPanel = new JPanel();

		private Dimension buttonSize = new Dimension(screenX / 4, screenY / 9),
				labelSize = new Dimension(screenX / 8, screenY / 9),
				txtSize = new Dimension((int) (screenX / 2.5), screenY / 9);

		private LoadJFrame() {
			startUp = new Company();
			JFrame frame = new JFrame();
			frame.setTitle("Company Management Tool"); // set title at top of frame
			frame.setResizable(true); // frame is fixed size
			frame.setLocationRelativeTo(this); // default location to centre of screen
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			loadPanels();
			loadButtonHandlers(frame);
			frame.add(empPanel, BorderLayout.EAST);
			frame.add(empInfoPanel, BorderLayout.CENTER);
			frame.add(fileIOPanel, BorderLayout.SOUTH);
			frame.pack();
			frame.setVisible(true);
		}

		private void loadPanels() {
			GBAssist c = new GBAssist();
			empPanel.setLayout(new GridLayout(7, 1, 10, 10));
			loadButton(empPanel, addManagerEmployeeBtn, buttonSize, 16);
			loadButton(empPanel, addStaffEmployeeBtn, buttonSize, 16);
			loadButton(empPanel, addTempEmployeeBtn, buttonSize, 16);
			loadButton(empPanel, deleteEmployeeBtn, buttonSize, 16);
			loadButton(empPanel, findEmployeeBtn, buttonSize, 16);
			loadButton(empPanel, nextEmployeeBtn, buttonSize, 16);
			loadButton(empPanel, previousEmployeeBtn, buttonSize, 16);
			empPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

			fileIOPanel.setLayout(new GridLayout(1, 2, 10, 10));
			loadButton(fileIOPanel, saveToFileBtn, buttonSize, 16);
			loadButton(fileIOPanel, loadFromFileBtn, buttonSize, 16);
			fileIOPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

			empInfoPanel.setLayout(new GridLayout(10, 0, 2, 10));
			empInfoPanel.setPreferredSize(new Dimension(screenX / 2, screenY / 2));
			empInfoPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

			empInfoPanel.add(empName, c.setGrid(0, 0, labelSize));
			empName.setFont(new Font("SansSerif", Font.PLAIN, 16));
			empInfoPanel.add(txtName, c.setGrid(1, 0, txtSize));
			txtName.setFont(new Font("SansSerif", Font.PLAIN, 20));

			empInfoPanel.add(empNumber, c.setGrid(2, 0, labelSize));
			empNumber.setFont(new Font("SansSerif", Font.PLAIN, 16));
			empInfoPanel.add(txtNumber, c.setGrid(3, 0, txtSize));
			txtNumber.setFont(new Font("SansSerif", Font.PLAIN, 20));

			empInfoPanel.add(empStartDate, c.setGrid(4, 0, labelSize));
			empStartDate.setFont(new Font("SansSerif", Font.PLAIN, 16));
			empInfoPanel.add(txtStartDate, c.setGrid(5, 0, txtSize));
			txtStartDate.setFont(new Font("SansSerif", Font.PLAIN, 20));

			empInfoPanel.add(empSalary, c.setGrid(6, 0, labelSize));
			empSalary.setFont(new Font("SansSerif", Font.PLAIN, 16));
			empInfoPanel.add(txtSalary, c.setGrid(7, 0, txtSize));
			txtSalary.setFont(new Font("SansSerif", Font.PLAIN, 20));

			empInfoPanel.add(empExtraInfo, c.setGrid(8, 0, labelSize));
			empExtraInfo.setFont(new Font("SansSerif", Font.PLAIN, 16));
			empInfoPanel.add(txtExtraInfo, c.setGrid(9, 0, txtSize));
			txtExtraInfo.setFont(new Font("SansSerif", Font.PLAIN, 20));

		}

		private void loadButton(JPanel p, JButton btn, Dimension d, int fontSize) {
			p.add(btn);
			btn.setPreferredSize(d);
			btn.setFont(new Font("SansSerif", Font.PLAIN, fontSize));
		}

		public String getNameFromTextArea() {
			return txtName.getText();
		}

		// TODO #1: write getters for the four other text boxes
		public int getNumberFromTextArea() {
			try {
				txtNumber.setOpaque(true);
				txtNumber.setBackground(Color.white);
				return Integer.parseInt(txtNumber.getText());
			} catch (NumberFormatException e) {
				txtNumber.setOpaque(true);
				txtNumber.setBackground(Color.red);
				throw new NumberFormatException("Wrong Number input,Try Again!");
			}

		}

		public OurDate getStartDateFromTextArea() throws ParseException {
			Date date = null;
			OurDate ourDate = null;

			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			try {
				txtStartDate.setOpaque(true);
				txtStartDate.setBackground(Color.white);
				formatter.setLenient(false);
				date = formatter.parse(txtStartDate.getText());
				ourDate = new OurDate(date);
				return ourDate;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				txtStartDate.setOpaque(true);
				txtStartDate.setBackground(Color.red);
			
				throw new ParseException("Wrong Date input,Try Again!",1);
			}

			

		}

		public OurDate getOurDateFromText(String sdate) {
			Date date = null;
			OurDate ourDate = null;

			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			try {
				txtExtraInfo.setOpaque(true);
				txtExtraInfo.setBackground(Color.white);
				date = formatter.parse(sdate);
				ourDate = new OurDate(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				txtExtraInfo.setOpaque(true);
				txtExtraInfo.setBackground(Color.red);
				throw new NumberFormatException("Wrong Date input,Try Again!");
			}

			return ourDate;
		}

		public double getSalaryFromTextArea() {
			try {
				txtSalary.setOpaque(true);
				txtSalary.setBackground(Color.white);
				return Double.parseDouble(txtSalary.getText());
			} catch (NumberFormatException e) {
				txtSalary.setOpaque(true);
				txtSalary.setBackground(Color.white);
				txtSalary.setBackground(Color.red);
				throw new NumberFormatException("Wrong Number input,Try Again!");
			}
		}

		public String getExtraInfoFromTextArea() {
			return txtExtraInfo.getText();
		}

		public void setNameToTextArea(String name) {
			txtName.setText(name);
		}

		// TODO #2: write setters for the four other text boxes
		public void setNumberToTextArea(int number) {
			txtNumber.setText(Integer.toString(number));
		}

		public void setStartDateToTextArea(OurDate ourDate) {
			txtStartDate.setText(ourDate.toString());
		}

		public void setSalaryToTextArea(double d) {
			txtSalary.setText(Double.toString(d));
		}

		public void setExtraInfoToTextArea(String extraInfo) {
			txtExtraInfo.setText(extraInfo);
		}

		private void showEmployeePanel(Employee e) {
			setNameToTextArea(e.getName());
			setNumberToTextArea(e.getEmployeeNumber());
			setStartDateToTextArea(e.getStartDate());
			setSalaryToTextArea(e.getSalary());
			setExtraInfoToTextArea(e.getExtraInfo());
		}

		private void loadButtonHandlers(JFrame frame) {

			addManagerEmployeeBtn.addActionListener(event -> {
				try {
					Employee emp = new Manager(getNameFromTextArea(), getNumberFromTextArea(),
							getStartDateFromTextArea(), getSalaryFromTextArea(), getExtraInfoFromTextArea());
					startUp.addEmployee(emp);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(frame, e.getMessage());
				}
			});
			addStaffEmployeeBtn.addActionListener(event -> {
				try {
					Employee emp = new Staff(getNameFromTextArea(), getNumberFromTextArea(), getStartDateFromTextArea(),
							getSalaryFromTextArea(), getExtraInfoFromTextArea());
					startUp.addEmployee(emp);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(frame, e.getMessage());
				}
			});
			addTempEmployeeBtn.addActionListener(event -> {
				try {
					Employee emp = new Temp(getNameFromTextArea(), getNumberFromTextArea(), getStartDateFromTextArea(),
							getSalaryFromTextArea(), getOurDateFromText(getExtraInfoFromTextArea()));
					startUp.addEmployee(emp);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(frame, e.getMessage());
				}
			});

			deleteEmployeeBtn.addActionListener(event -> {
				try {
					Employee emp = startUp.deleteEmployee(getNumberFromTextArea());
					if (emp != null)
						showEmployeePanel(emp);
					else {

					}

				} catch (Exception e) {
					JOptionPane.showMessageDialog(frame, e.getMessage());
				}
			});

			findEmployeeBtn.addActionListener(event -> {
				try {
					Employee emp = startUp.findEmployee(getNumberFromTextArea());
					if (emp != null)
						showEmployeePanel(emp);
					else {
						/* Not found, reset the current number, display something */
						startUp.setCurrentEmployee(0);
						OurDate invalidDate = new OurDate();
						Employee empWrong = new Manager("WALLAH", 0, invalidDate, 0.0, "?????????????");
						showEmployeePanel(empWrong);
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(frame, e.getMessage());
				}
			});

			nextEmployeeBtn.addActionListener(event -> {
				try {
					Employee emp = startUp.getNextEmployee();
					if (emp != null)
						showEmployeePanel(emp);
					else {

					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(frame, e.getMessage());
				}
			});

			previousEmployeeBtn.addActionListener(event -> {
				try {
					Employee emp = startUp.getPrivousEmployee();
					if (emp != null)
						showEmployeePanel(emp);
					else {

					}

				} catch (Exception e) {
					JOptionPane.showMessageDialog(frame, e.getMessage());
				}
			});

			saveToFileBtn.addActionListener(event -> {
				Employee etmp ;
				startUp.saveEmployeesToFile();
				etmp = startUp.findEmployeeByNumber(startUp.getCurrentEmployee());
				if(etmp != null)
					showEmployeePanel(etmp);
			});

			loadFromFileBtn.addActionListener(event -> {
				Employee etmp ;
				startUp.loadEmployeesFromFile();
				etmp = startUp.findEmployeeByNumber(startUp.getCurrentEmployee());
				if(etmp != null)
					showEmployeePanel(etmp);
			});
		}
	}

}
