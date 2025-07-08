'''
说明：CRAPS又称花旗骰，是美国拉斯维加斯非常受欢迎的一种的桌上赌博游戏。该游戏使用两粒骰子，玩家通过摇两粒骰子获得点数进行游戏。简化
后的规则是：玩家第一次摇骰子如果摇出了 7 点或 11 点，玩家胜；玩家第一次如果摇出 2 点、3 点或 12 点，庄家胜；玩家如果摇出其他点数则
游戏继续，玩家重新摇骰子，如果玩家摇出了 7 点，庄家胜；如果玩家摇出了第一次摇的点数，玩家胜；其他点数玩家继续摇骰子，直到分出胜负。为
了增加代码的趣味性，我们设定游戏开始时玩家有 1000 元的赌注，每局游戏开始之前，玩家先下注，如果玩家获胜就可以获得对应下注金额的奖励，
如果庄家获胜，玩家就会输掉自己下注的金额。游戏结束的条件是玩家破产（输光所有的赌注）。
'''

import random

money = 1000
while money > 0:
    print(f'当前余额：{money}元')
    while True:
        debt = int(input("请输入下注金额："))
        if 0 < debt <= money:
            break
    point1 = random.randrange(1,7) + random.randrange(1,7)
    print(f"摇出了{point1}点")
    if point1 == 7 or point1 == 11:
        print('玩家胜!\n')
        money += debt
    elif point1 == 2 or point1 ==3 or point1 ==12:
        print('庄家胜!\n')
        money -=debt
    else:
        while True:
            point2 = random.randrange(1, 7) + random.randrange(1, 7)
            print(f"摇出了{point2}点")
            if point2 == 7:
                print('庄家胜!\n')
                money -= debt
                break
            elif point2 == point1:
                print('玩家胜!\n')
                money+= debt
                break
            else:
                continue
print('你破产了')