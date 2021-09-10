package com.example.iterator;

public class TCLTelevision implements Television{

    private Object[] obj = {"江苏卫视","湖北卫视","北京卫视","山东卫视","湖南卫视","浙江卫视"};

    @Override
    public TVIterator createIterator() {
        return new TCLIterator();
    }

    private class TCLIterator implements TVIterator {

        private int currentIndex = 0;

        @Override
        public void setChannel(int i) {
            currentIndex = i;
        }

        @Override
        public void next() {
            if (currentIndex < obj.length) {
                currentIndex++;
            }
        }

        @Override
        public void previous() {
            if (currentIndex > 0) {
                currentIndex--;
            }
        }

        @Override
        public boolean isLast() {
            return currentIndex == obj.length;
        }

        @Override
        public Object currentChannel() {
            return obj[currentIndex];
        }

        @Override
        public boolean isFirst() {
            return currentIndex == 0;
        }
    }

}
