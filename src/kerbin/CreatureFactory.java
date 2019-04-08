package kerbin;
// Factory для существ, создает Creature, Ai, и помещает в свободный тайл
import asciiPanel.AsciiPanel;
import kerbin.items.Item;
import kerbin.items.ItemFactory;

public class CreatureFactory {
    private World world;
    private ItemFactory itemFactory;
    public CreatureFactory(World world){
        this.world = world;
        this.itemFactory = new ItemFactory(world);
    }
    public Creature newPlayer(){
        Creature player = new Creature(world, '@', AsciiPanel.brightWhite, "Player", 100,3,0,100,0);
        world.addAtEmptyLocation(player);
        new PlayerAi(player);
        return player;
    }
    public Creature newMouse(){
        Creature mouse = new Creature(world, 'm', AsciiPanel.red, "mouse",(int)(1+Math.random()*10),(int)(1+Math.random()*10),(int)(Math.random()*5),11,10);
        mouse.setWeapon(itemFactory.newTeeth(mouse));
        mouse.setArmor(itemFactory.newHide(mouse));
        world.addAtEmptyLocation(mouse);
        new MouseAi(mouse);
        return mouse;
    }
    public Creature newSkeleton(){
        Creature skeleton = new Creature(world, 's', AsciiPanel.yellow, "skeleton",(int)(1+Math.random()*10),(int)(1+Math.random()*10),(int)(Math.random()*5),11,10);
        skeleton.setWeapon(itemFactory.newTeeth(skeleton));
        skeleton.setArmor(itemFactory.newHide(skeleton));
        world.addAtEmptyLocation(skeleton);
        new SkeletonAi(skeleton);
        return skeleton;
    }
    public Creature newMob(){
        Creature mob = new Creature(world, '&', AsciiPanel.brightCyan, "mob",(int)(1+Math.random()*10),(int)(1+Math.random()*10),(int)(Math.random()*5),11,10);
        mob.setWeapon(itemFactory.newTeeth(mob));
        mob.setArmor(itemFactory.newHide(mob));
        world.addAtEmptyLocation(mob);
        new MobAi(mob);
        return mob;
    }
}