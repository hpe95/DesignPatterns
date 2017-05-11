package Command;

public class RedSkillConcreteCommand implements SkillCommand {
	SkillManagerReceiver skillManager;
	
	public RedSkillConcreteCommand(SkillManagerReceiver skill){
		this.skillManager = skill;
	}
	public void execute(){
		this.skillManager.redSkill();
		System.out.println("Aumento do atk speed!");
	}
}
