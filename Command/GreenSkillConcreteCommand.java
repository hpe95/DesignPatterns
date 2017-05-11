package Command;

public class GreenSkillConcreteCommand implements SkillCommand {
	SkillManagerReceiver skillManager;
	
	public GreenSkillConcreteCommand(SkillManagerReceiver skill){
		this.skillManager = skill;
	}
	public void execute(){
		this.skillManager.greenSkill();
		System.out.println("Veneno utilizado!");
	}
}
