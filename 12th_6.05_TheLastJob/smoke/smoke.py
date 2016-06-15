#!/usr/local/bin/python
# -*- coding: utf-8 -*-

import os
from time import sleep

import unittest

from appium import webdriver

# Returns abs path relative to this file and not cwd
PATH = lambda p: os.path.abspath(
    os.path.join(os.path.dirname(__file__), p)
)

class SimpleAndroidTests(unittest.TestCase):
    def setUp(self):
        desired_caps = {}
        desired_caps['platformName'] = 'Android'
        desired_caps['platformVersion'] = '4.4'
        desired_caps['deviceName'] = 'testerhome'
        desired_caps['unicodekeyboard'] = 'ture' #appium启动过程安装官方的输入法
        desired_caps['resetkeyboard'] = 'ture' #用例运行完后把输入法切换原来输入法
        desired_caps['app'] = PATH(
            'ApiDemos-debug'
        )

        self.driver = webdriver.Remote('http://localhost:4723/wd/hub', desired_caps)

    def tearDown(self):
        # end the session
        self.driver.quit()

    
    def test_find_elements(self):

        self.driver.implicitly_wait(10)    #隐式等待10s
        
        #寻找某一行的内容并进去
        topicTitle = self.driver.find_elements_by_id('com.wasai.helloword:id/btn1')
        topicTitle[2].click()
        sleep(5)

        
        
        
  

if __name__ == '__main__':
    suite = unittest.TestLoader().loadTestsFromTestCase(SimpleAndroidTests)
    unittest.TextTestRunner(verbosity=2).run(suite)
