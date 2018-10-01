package cn.legeyung.study10;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 * 卡片布局 GridBagConstraints 类指定使用 GridBagLayout 类布置的组件的约束
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class NewGridBagLayout {
	public static void main(String[] args) {
		// 创建窗口容器并设置布局管理器
		Frame f = new Frame("这是GridBagLayout示例");
		f.setLayout(new GridBagLayout());
		GridBagConstraints gbcs = new GridBagConstraints();
		// 设置横向坐标和纵向坐标，并加入按钮
		gbcs.gridx = 0;// gridx指定包含组件的显示区域开始边的单元格，其中行的第一个单元格为 gridx=0
		gbcs.gridy = 0;// gridy指定位于组件显示区域的顶部的单元格，其中最上边的单元格为 gridy=0。
		f.add(new Button("按钮一"), gbcs);
		// 设置横向坐标和纵向坐标，并加入按钮
		gbcs.gridx = 1;
		gbcs.gridy = 0;
		f.add(new Button("按钮二"), gbcs);
		// 设置横向坐标和纵向坐标，并加入按钮
		gbcs.gridx = 0;
		gbcs.gridy = 1;
		f.add(new Button("按钮三"), gbcs);
		// 设置横向坐标和纵向坐标，并加入按钮
		gbcs.gridx = 1;
		gbcs.gridy = 1;
		f.add(new Button("按钮四"), gbcs);

		f.setSize(200, 200);
		f.setVisible(true);

	}
}
