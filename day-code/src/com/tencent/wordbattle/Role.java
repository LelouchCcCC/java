package com.tencent.wordbattle;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;
    String[] boyfaces= {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces ={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};
    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role role) {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int index = r.nextInt(attacks_desc.length);
        String kongfu = attacks_desc[index];
        int index2 = r.nextInt(injureds_desc.length);
        String injured = injureds_desc[index2];
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood > 0 ? remainBlood : 0;
        role.setBlood(remainBlood);
        System.out.printf(kongfu+injured+"造成了%d点伤害，%s还剩下%d点血。",this.getName(),role.getName(),role.getName(),hurt,role.getName(),remainBlood);
        System.out.println();
//        System.out.println(this.getName() + "举起拳头，打了" + role.getName() + "，造成了" + hurt + "点伤害，" + role.getName() + "还剩下" + remainBlood + "点血。");
    }

    public void setFace(){
        Random r = new Random();
        if (this.gender == '男'){
            int n = r.nextInt(boyfaces.length);
            this.face = boyfaces[n];
        }
        else if (this.gender == '女'){
            int n = r.nextInt(girlfaces.length);
            this.face = girlfaces[n];
        }
        else this.face = "这是人啊？";
    }
}
