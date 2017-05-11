package Command;

public class Client {

	public static void main(String[] args) {
		SkillManagerReceiver skill = new SkillManagerReceiver();
		ListCommand listSkill = new ListCommand();
		RedSkillConcreteCommand red = new RedSkillConcreteCommand(skill);
		GreenSkillConcreteCommand gre = new GreenSkillConcreteCommand(skill);
		listSkill.add(red);
		listSkill.add(gre);
		listSkill.execute();
		listSkill.remove(red);
		listSkill.execute();
		
	}

}
