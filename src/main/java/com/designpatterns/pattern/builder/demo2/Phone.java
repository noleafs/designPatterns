package com.designpatterns.pattern.builder.demo2;

/**
 * @author tanyun
 * @Description 手机类 建造者模式的另外一种常见用法
 * @date 2021/12/19 15:01
 */
public class Phone {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    private Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainboard = builder.mainboard;
    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Phone.Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Phone.Builder screent(String screen) {
            this.screen = screen;
            return this;
        }

        public Phone.Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Phone.Builder mainboard(String mainboard) {
            this.mainboard = mainboard;
            return this;
        }

        /**
         * 构建对象
         * @return 返回phone对象
         */
        public Phone build() {
            return new Phone(this);
        }

    }


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }
}
