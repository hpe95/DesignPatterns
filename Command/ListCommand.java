package Command;

import java.util.ArrayList;

public class ListCommand {
	ArrayList<SkillCommand> listCommand;
	public ListCommand(){
		this.listCommand = new ArrayList<SkillCommand>();
	}
	
	public void add(SkillCommand skill){
		this.listCommand.add(skill);
	}
	
	public void remove(SkillCommand skill){
		this.listCommand.remove(skill);
	}
	
	public void execute(){
		for(SkillCommand skill : listCommand){
			skill.execute();
		}
	}
}
