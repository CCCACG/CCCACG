package 第三天作业1到6;

public class Army {
	private Weapon[] w;
	private int count=0;
	public Army(int a) {
		this.w=new Weapon[a];
		
	}
	public void addWeapon(Weapon flighter){
		if (count<w.length) {
			w[count]=flighter;
			count++;
			
		}else {
			System.out.println("无法装备武器");
		}}
		public void attackAll(){
			for (int i = 0; i < count; i++) {
				w[i].attack();
			}
			
			}public void moveAll(){
				for (int i = 0; i < count; i++) {
					w[i].move();
				}
			}
		}


