
import time

from  selenium import webdriver

driver = webdriver.Firefox()

driver.get("http://www.google.com")

print('max bro size')

driver.maximize_window()

time.sleep(2)

# driver.quit()


