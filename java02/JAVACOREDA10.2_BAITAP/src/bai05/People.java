package bai05;

import java.util.List;

public class People {

	private int name;
	private List<Card> bai;

	public People() {
		this.name = (int) (Math.random() * 5);
	}

	@Override
	public String toString() {
		String result = "";
		switch (name) {
		case 0: 	result = "Mỹ    ";	break;
		case 1:		result = "Chiến ";	break;
		case 2:		result = "Nguyên";	break;
		case 3:		result = "Lập   ";	break;
		case 4:		result = "Linh  ";	break;
		case 5:		result = "Quyền ";	break;
		}
		return result;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public List<Card> getBai() {
		return bai;
	}

	public void setBai(List<Card> bai) {
		this.bai = bai;
	}

}
