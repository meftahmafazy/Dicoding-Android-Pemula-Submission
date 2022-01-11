package com.example.valoagent;

import java.util.ArrayList;

public class AgentData {
    private static String[] agentName = {
            "Astra",
            "Breach",
            "Brimstone",
            "Chamber",
            "Cypher",
            "Jett",
            "Kay/O",
            "Killjoy",
            "Omen",
            "Phoenix",
            "Raze",
            "Reyna",
            "Sage",
            "Skye",
            "Sova",
            "Viper",
            "Yoru"
    };

    private static String[] agentRole = {
            "Controller",
            "Initiator",
            "Controller",
            "Sentinel",
            "Sentinel",
            "Duelist",
            "Initiator",
            "Sentinel",
            "Controller",
            "Duelist",
            "Duelist",
            "Duelist",
            "Sentinel",
            "Initiator",
            "Initiator",
            "Controller",
            "Duelist"
    };

    private static String[] agentDetail ={
            "Astra is an energetic and joyful agent who doesn't hold back what she wants to say. She is fairly straightforward when it comes to expressing herself and friendly banter is definitely her go-to style. She seems to have an affinity for liveliness, and doesn't like it when people and places have no 'color' or 'personality' to them.",
            "Breach's main gimmick is the ability to use all of his abilities through the geometry of the map, whether it is through walls, roofs, or terrain. This ability set rewards experienced players for knowing the maps well. His abilities also seem to reward an aggressive playstyle despite most of his abilities being crowd-control based.",
            "The oldest of the group, Brimstone is a commander with a long history of wearing a uniform, but as if teaching from age and experience wasn't enough to prove his place in leading an organization composed of unique individuals who are each an elite in their own right, then perhaps continuing to work with boots on the ground sealed the deal.",
            "Cypher is constantly gathering secrets, information, and intel, to the point of managing to retrieve the passwords of everyone in the Valorant Protocol. He keeps most of this information to himself, making sure that no one ever discovers them and only revealing anything he knows for a price. In contrast of how he knows a lot about his allies, they do not know much about him, and he prefers to keep it that way.",
            "A gentleman assassin by character and a sentinel by role, Chamber offers a set of abilities in the battlefield as sharp as his fashion sense. Always bringing his custom armory in the fray alongside the standard issue weaponry, you can rest assured that this agent will never run out of guns - and bullets - as you play.",
            "The wind is commonly known for being cool, but Jett is an aggressive agent who has a distinctive, sarcastic personality. Jett also has a cheeky, childish \"in-your-face\" attitude, seen commonly giving insults for feats she makes on the team and is always spouting her sheer amount of arrogance. Her self-confidence may feel as if she is disregarding her comrades' safety, but she has recognized that it is best to play with a team, albeit with some reluctance. She does show a much more friendly personality towards teammates.",
            "KAY/O brings a new variable to the battlefield with the ability to suppress his enemies, either making radiants temporarily powerless or momentarily deactivating enemy technology. Through this, KAY/O is more than capable of fulfilling his prime directive: neutralize the enemy and protect his Earth.",
            "The epitome of German efficiency, Killjoy always shows excitement at the opportunity of being able to use the technology she builds to its fullest extent, as well as the chance to retrieve additional knowledge. Always ambitious in her work, Killjoy has shamelessly admitted that she has a history of exploiting tech-related missions in order to \"weasel more money\" out of the Protocol's quarterly budget.",
            "A living nightmare, Omen takes full advantage of his shadowed physique and will not hesitate to eliminate his enemies using the forces of paranoia and fear. He is cynical in nature, which stems from him experiencing extreme pain as he was condemned to remain in the state that he is today. If there's one person who wants to know more about his mysterious circumstances, it's Omen himself - and quite desperately so.",
            "A duelist by role and nature, Phoenix is brash, impulsive, and has a lot of confidence, never hesitating to charge into a fight head-on despite not getting a full grasp of the situation, much to the chagrin of his more collected teammates. As shown in \"Retake,\" if Phoenix gets himself in a sticky situation caused by his own impatience, he is more than capable of quickly adapting to the circumstances and turning the tables around, before rubbing it in the faces of teammates who initially doubted him.",
            "Raze's playstyle is very aggressive compared to many of the other agents in VALORANT, as most of her abilities are focused on mobility and damage instead of intel gathering or support. She is one of the few agents wherein all of her abilities are primarily meant to deal damage, namely Paint Shells and Showstopper, meaning that there is no doubt to her role as a duelist.",
            "Reyna joined the Valorant Protocol roster in the first-ever update after the global launch. Her power revolves around consuming the opponent's soul. Her abilities are all about blinding opponents and self-regeneration. This makes Reyna a powerful Duelist who can hold her own ground. Nevertheless, Reyna is difficult to master as most of her abilities are dependent on getting kills.",
            "Described as a stronghold, Sage is an agent who always looks out for her teammates and offers help whenever she can. She has fully embraced her powers which give her control of life, and wishes to use them to keep her team alive for as long as possible. Calmer and more collected than some of her more energetic allies, Sage always imparts encouraging words to rally the team up and guide them to victory.",
            "While Skye has said that she was not used to working with other people prior to joining VALORANT, she has quickly shown herself to be a team player through and through, guiding and reminding her team to move as one unit and work together as they complete their mission. With her affinity to feel and sense the natural world and everything else around her, Skye is naturally observant, and will quickly note whenever she senses something unusual with her surroundings.",
            "A humble hunter that has taken down man and beast alike, Sova works carefully and with precision, scouting around and retrieving information before taking out the enemy. As he has told Phoenix, Sova believes in the value of patience and strategic thinking. Being the team player that he is, Sova always commends his allies and never hesitates to voice out his vote of confidence in them. He seems to value the team to the point of risking his own life, to which Brimstone reminds him that it is equally important that he looks out after himself.",
            "Viper is a savage and confident agent who doesn't fear enemies, and in fact desires the enemies' fear. She does not hesitate to call herself a villain and a monster, and will act like both if it means the success of her objective. Just like her abilities, she can be quite \"toxic\", however she is seen being more amiable and caring towards her teammates, but she will not hesitate to reprimand them harshly should they make major miscalculations in the battlefield.",
            "Yoru is undeniably arrogant, and is known to be easily annoyed and irritated by people, including his own teammates. He operates mostly as a lone wolf, preferring to take down entire enemy teams on his own and has shown to cooperate with his team only out of reluctance. Being the powerful rift walker that he is, Yoru thinks quite highly of himself and his abilities, always looking down on his enemies and referring to them as \"minnows\" - nothing more than small fish.",
    };

    private static int[] agentImg ={
            R.drawable.astra,
            R.drawable.breach,
            R.drawable.brimstone,
            R.drawable.chamber,
            R.drawable.cypher,
            R.drawable.jett,
            R.drawable.kayo,
            R.drawable.killjoy,
            R.drawable.omen,
            R.drawable.phoenix,
            R.drawable.raze,
            R.drawable.reyna,
            R.drawable.sage,
            R.drawable.skye,
            R.drawable.sova,
            R.drawable.viper,
            R.drawable.yoru
    };

    static ArrayList<Agent> getListData(){
        ArrayList<Agent> list = new ArrayList<>();
        for (int position = 0; position < agentName.length; position++){
            Agent agent = new Agent();
            agent.setName(agentName[position]);
            agent.setRole(agentRole[position]);
            agent.setPhoto(agentImg[position]);
            agent.setDetail(agentDetail[position]);
            list.add(agent);
        }
        return list;
    }
}

