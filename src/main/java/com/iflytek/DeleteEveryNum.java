package com.iflytek;

/**
 * description
 * projectName  test
 * package com.iflytek
 *
 * @author xingli12
 * @version v1
 * //      ┏┛ ┻━━━━━┛ ┻┓
 * //      ┃　　　　　　 ┃
 * //      ┃　　　━　　　┃
 * //      ┃　┳┛　  ┗┳　┃
 * //      ┃　　　　　　 ┃
 * //      ┃　　　┻　　　┃
 * //      ┃　　　　　　 ┃
 * //      ┗━┓　　　┏━━━┛
 * //        ┃　　　┃   神兽保佑
 * //        ┃　　　┃   代码无BUG！
 * //        ┃　　　┗━━━━━━━━━┓
 * //        ┃　　　　　　　    ┣┓
 * //        ┃　　　　         ┏┛
 * //        ┗━┓ ┓ ┏━━━┳ ┓ ┏━┛
 * //          ┃ ┫ ┫   ┃ ┫ ┫
 * //          ┗━┻━┛   ┗━┻━┛
 * @date Created in 2018-10-11 20:12
 * modified By
 * updateDate
 */

public class DeleteEveryNum{
    public static void main(String[] args){
        int lastIndex = getLastIndex(8,2);
        System.out.printf("最终删除的下标为:%s\n" , lastIndex);
    }

    public static int getLastIndex(int length,int step){

        //数组长度小于等于0,则返回负数
        if(length <= 0){
            return -1;
        }
        int[] arr = new int[length];
        //给数组统一赋值为length
        for(int i = 0;i<length;i++){
            arr[i] = length;
        }

        //设置删除标志为length+1
        final int delFlag = length + 1;

        //有效长度,初始为原长度
        int newLength = length;
        //计数
        int count = 0;

        //最后删除的下标，初始为0
        int lastIndex = 0;

        //当前下标，初始为0
        int i = 0;

        while(newLength != 0){
            if(arr[i] != delFlag){
                if(count ++ == step){
                    //设置为删除标志
                    arr[i] = delFlag;
                    //记录该下标
                    lastIndex = i;
                    System.out.printf("目前删除的下标为:%s\n" , lastIndex);
                    //有效长度减1
                    newLength --;
                    //计数归0
                    count = 0;
                }
            }
            //模运算使得下标可循环
            i = (i + 1) % length;
        }

        return lastIndex;

    }
}
