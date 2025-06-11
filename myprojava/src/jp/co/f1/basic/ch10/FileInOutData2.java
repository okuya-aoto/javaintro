package jp.co.f1.basic.ch10;
import java.util.ArrayList;
public class FileInOutData2 {

	public static void main(String[] args) {
		int sum = 0; //合計点格納用変数
		double ave = 0.0; //平均点格納用変数
		String[] strData = null; //読み込みデータの分割格納用配列
		String strLine = null; //1桁データ格納用変数
		
		ArrayList<String> subjectList = new ArrayList<String>(); //教科格納用配列
		ArrayList<Integer> scoreList = new ArrayList<Integer>(); //点数格納用配列
		
		//提供クラスのオブジェクト化
		FileIn in = new FileIn(); //ファイル入力
		FileOut out = new FileOut(); //ファイル出力
		
		//教科データファイルの読み込み
		if(in.open("subject_data.csv")== false) {
			System.exit(1);
		}
		
		//全データを配列に読み込む
		while ((strLine = in.readLine())!= null) {
			//読み込み１桁データカンマで分割
			strData = strLine.split(",");
			
			//各配列にデータを格納
			subjectList.add(strData[0]);
			scoreList.add(Integer.parseInt(strData[1]));
		}
		//ストリームのクローズ
		if(in.close() == false) {
			System.exit(2);
		}
		System.out.println("ファイルの読み込みが終了しました。");
		
		//書き込みファイルのオープン
		if(out.open("statistics.txt")== false) {
			System.exit(3);
		}
		//読み込みデータをファイルに書き込む
		for(int i = 0; i < subjectList.size(); i++) {
			out.writeln(subjectList.get(i)+ "<--->" + scoreList.get(i));
		}
		//合計点を算出しファイルに書き込む
		for(int i = 0; i < scoreList.size(); i++) {
			sum += scoreList.get(i);
		}
		out.writeln("合計点："+ sum);
		
		//平均点を算出しファイルに書き込む
		ave = (double) sum / scoreList.size();
		out.writeln("平均点："+ ave);
		
		//書き込みファイルのクローズ
		if(out.close() == false) {
			System.exit(4);
		}
		System.out.println("ファイルへ書き込みが終了しました。");
	}
}
