package ntu_63132681;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JList;

public class FrameJList extends JFrame {
	
	// khai báo các giá trị

	private static final long serialVersionUID = 1L;
	private JPanel contentPane, panel, panel_1,panel_2, panel_3, panel_4;
	private JTextField txtData;
	private JList<String> list;
	private JButton btnBoldSoChan, btnBoldSoLe, btnBoldSoNT, btnDeleteBold, btnDeleteResultBold, btnTong, btnAddItem;

	public FrameJList() {
		setTitle("Thao tác");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 748, 47);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Thao tác trên JList - Checkbox");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_1.add(lblNewLabel);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(60, 196, 73), 2, true), "Ch\u1ECDn thao t\u00E1c", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahomo", Font.BOLD, 15), new Color(0, 0, 0)));
		panel_3.setBounds(0, 49, 279, 362);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		btnBoldSoChan = new JButton("Tô đen số chẵn");
		btnBoldSoChan.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBoldSoChan.setBounds(10, 28, 247, 38);
		panel_3.add(btnBoldSoChan);
		
		btnBoldSoLe = new JButton("Tô đen số lẻ");
		btnBoldSoLe.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBoldSoLe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBoldSoLe.setBounds(10, 74, 247, 38);
		panel_3.add(btnBoldSoLe);
		
		btnBoldSoNT = new JButton("Tô đen số nguyên tố");
		btnBoldSoNT.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnBoldSoNT.setBounds(10, 122, 247, 38);
		panel_3.add(btnBoldSoNT);
		
		btnDeleteBold = new JButton("Bỏ tô đen");
		btnDeleteBold.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDeleteBold.setBounds(10, 170, 247, 38);
		panel_3.add(btnDeleteBold);
		
		btnDeleteResultBold = new JButton("Xóa giá trị tô đen");
		btnDeleteResultBold.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDeleteResultBold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeleteResultBold.setBounds(10, 218, 247, 38);
		panel_3.add(btnDeleteResultBold);
		
		btnTong = new JButton("Tổng giá trị trong list");
		btnTong.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnTong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTong.setBounds(10, 266, 247, 38);
		panel_3.add(btnTong);
		
		JLabel txtTong = new JLabel("");
		txtTong.setBounds(10, 314, 247, 38);
		panel_3.add(txtTong);
		
		panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(128, 0, 0), 2, true), "Nh\u1EADp th\u00F4ng tin", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahomo", Font.BOLD, 15), new Color(0, 0, 0)));
		panel_4.setBounds(278, 49, 470, 362);
		panel_4.setLayout(null);
		panel.add(panel_4);
		
		btnAddItem = new JButton("Thêm");
		btnAddItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddItem.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAddItem.setBounds(26, 36, 114, 41);
		panel_4.add(btnAddItem);
		
		txtData = new JTextField();
		txtData.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtData.setBounds(156, 43, 102, 28);
		panel_4.add(txtData);
		txtData.setColumns(10);
		
		JCheckBox cbSoAm = new JCheckBox("Cho nhập số âm");
		cbSoAm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbSoAm.setBounds(282, 46, 168, 21);
		panel_4.add(cbSoAm);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 87, 450, 265);
		panel_4.add(scrollPane);
		
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		list = new JList<String>(model);
		DefaultListModel<String> data = (DefaultListModel<String>) list.getModel();
		data.addElement("aaaaaaa");
		data.addElement("aaaaaaa");
		data.addElement("aaaaaaa");
		data.addElement("aaaaaaa");
		data.addElement("aaaaaaa");
		data.addElement("aaaaaaa");
		data.addElement("aaaaaaa");
		data.addElement("aaaaaaa");
		data.addElement("aaaaaaa");
		data.addElement("aaaaaaa");
		data.addElement("aaaaaaa");
		data.addElement("aaaaaaa");
		
		list.setBounds(10, 87, 450, 265);
		list.setFont(new Font("Tahoma", Font.PLAIN, 18));
		scrollPane.setViewportView(list);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		panel_2.setBounds(0, 415, 748, 67);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnExit = new JButton("Đóng chương trình");
		btnExit.setBounds(239, 10, 267, 39);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 22));
		panel_2.add(btnExit);
	}
}
