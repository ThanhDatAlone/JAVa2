import javax.swing.*;
import java.awt.*;

public class MyGUI extends JFrame {
    public MyGUI() {
        // Tạo một container JFrame
        Container container = getContentPane();
        container.setLayout(new GridLayout(3, 2)); // Sử dụng layout manager GridLayout với 3 hàng và 2 cột

        // Tạo các control và thêm vào container
        JLabel nameLabel = new JLabel("Tên:");
        container.add(nameLabel);

        JTextField nameField = new JTextField();
        container.add(nameField);

        JLabel genderLabel = new JLabel("Giới tính:");
        container.add(genderLabel);

        JRadioButton maleRadioButton = new JRadioButton("Nam");
        JRadioButton femaleRadioButton = new JRadioButton("Nữ");
        ButtonGroup genderButtonGroup = new ButtonGroup(); // Tạo một ButtonGroup để nhóm các JRadioButton lại với nhau
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);
        JPanel genderPanel = new JPanel();
        genderPanel.setLayout(new FlowLayout()); // Sử dụng layout manager FlowLayout để các JRadioButton nằm cùng một dòng
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);
        container.add(genderPanel);

        JLabel foodLabel = new JLabel("Đồ ăn:");
        container.add(foodLabel);

        JCheckBox pizzaCheckBox = new JCheckBox("Pizza");
        JCheckBox burgerCheckBox = new JCheckBox("Burger");
        JCheckBox hotdogCheckBox = new JCheckBox("Hotdog");
        JPanel foodPanel = new JPanel();
        foodPanel.setLayout(new GridLayout(3, 1)); // Sử dụng layout manager GridLayout với 3 hàng và 1 cột để các JCheckBox nằm dọc
        foodPanel.add(pizzaCheckBox);
        foodPanel.add(burgerCheckBox);
        foodPanel.add(hotdogCheckBox);
        container.add(foodPanel);

        JButton submitButton = new JButton("Submit");
        container.add(submitButton);

        // Cài đặt thuộc tính cho JFrame
        setTitle("MyGUI");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyGUI();
    }
}

