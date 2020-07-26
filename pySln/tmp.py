# def my_decorator(func):
#     def wrapper():
#         print("wrapper of decorator")
#         func()
#
#     return wrapper
#
#
# def greet():
#     print('hello world')
#
#
# greet = my_decorator(greet)
# greet()


# def my_decorator(func):
#     def wrapper():
#         print('wrapper of decorator')
#         func()
#
#     return wrapper
#
#
# @my_decorator
# def greet():
#     print('hello world')

import functools
from datetime import time
from timeit import timeit


def my_decorator1(func):
    @functools.wraps(func)
    def wrapper(*args, **kwargs):
        print('execute decorator1')
        func(*args, **kwargs)

    return wrapper


def my_decorator2(func):
    @functools.wraps(func)
    def wrapper(*args, **kwargs):
        print('execute decorator2')
        func(*args, **kwargs)

    return wrapper


@my_decorator1
@my_decorator2
def greet(message):
    print(message)


# greet('hello world')

import os
import psutil


# 显示当前 python 程序占用的内存大小
def show_memory_info(hint):
    pid = os.getpid()
    p = psutil.Process(pid)
    ll = (i for i in range(100000000))
    res = sum(ll)
    print(res)
    info = p.memory_full_info()
    memory = info.uss / 1024. / 1024
    print('{} memory used: {} MB'.format(hint, memory))

# show_memory_info('exe')

# import asyncio
#
#
# async def crawl_page(url):
#     print('crawling {}'.format(url))
#     sleep_time = int(url.split('_')[-1])
#     await asyncio.sleep(sleep_time)
#     print('OK {}'.format(url))
#
#
# async def main(urls):
#     tasks = [asyncio.create_task(crawl_page(url)) for url in urls]
#     for task in tasks:
#         await task
# import time
# start = time.time()
# asyncio.run(main(['url_1', 'url_2', 'url_3', 'url_4']))
# end = time.time()
# print(end-start, 's')

import requests
import time
import threading
import concurrent.futures
import asyncio
import aiohttp

# def download_one(url):
#     resp = requests.get(url)
#     print('Read {} from {}'.format(len(resp.content), url))

async def download_one(url):
    async with aiohttp.ClientSession() as session:
        async with session.get(url) as resp:
            print('Read {} from {}'.format(resp.content_length, url))

async def download_all(sites):
    tasks = [asyncio.create_task(download_one(site)) for site in sites]
    await asyncio.gather(*tasks)


def main():
    sites = [
        'https://en.wikipedia.org/wiki/Portal:Arts',
        'https://en.wikipedia.org/wiki/Portal:History',
        'https://en.wikipedia.org/wiki/Portal:Society',
        'https://en.wikipedia.org/wiki/Portal:Biography',
        'https://en.wikipedia.org/wiki/Portal:Mathematics',
        'https://en.wikipedia.org/wiki/Portal:Technology',
        'https://en.wikipedia.org/wiki/Portal:Geography',
        'https://en.wikipedia.org/wiki/Portal:Science',
        'https://en.wikipedia.org/wiki/Computer_science',
        'https://en.wikipedia.org/wiki/Python_(programming_language)',
        'https://en.wikipedia.org/wiki/Java_(programming_language)',
        'https://en.wikipedia.org/wiki/PHP',
        'https://en.wikipedia.org/wiki/Node.js',
        'https://en.wikipedia.org/wiki/The_C_Programming_Language',
        'https://en.wikipedia.org/wiki/Go_(programming_language)'
    ]

    start_time = time.perf_counter()
    asyncio.run(download_all(sites))
    end_time = time.perf_counter()
    print('Download {} sites in {} seconds'.format(len(sites), end_time - start_time))

if __name__ == '__main__':
    main()
