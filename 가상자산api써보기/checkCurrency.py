import ccxt
import pprint
import pandas as pd

# 시장 조회
binance = ccxt.binance()
markets = binance.load_markets()

# print(markets.keys)
# print(len(markets))

# 비트코인의 가격을 가지고 온다.

#btc = binance.fetch_ticker("BTC/USDT")
#pprint.pprint(btc)
#ask	매도 1호가
#askVolume	매도 1호과 물량
#bid	매수 1호가
#bidVolume	매수 1호과 물량
#datetime	현재시간
#timestamp	타임 스탬프
#open	시가
#high	고가
#low	저가
#close	종가
#symbol	심볼

# 분봉 조회
# btc_ohlcv = binance.fetch_ohlcv("BTC/USDT")

# df= pd.DataFrame(btc_ohlcv, columns= ['datetime', 'open', 'high', 'low', 'close', 'volume'])
# # datetime은 utf기준으로 9시간의 차이가 난다.
# df["datetime"]= pd.to_datetime(df["datetime"], unit='ms')
# df.set_index('datetime', inplace=True)
# print(df)

# 일봉 조회
btc_ohlcv = binance.fetch_ohlcv("BTC/USDT", "1d")

df= pd.DataFrame(btc_ohlcv, columns= ['datetime', 'open', 'high', 'low', 'close', 'volume'])
# datetime은 utf기준으로 9시간의 차이가 난다.
df["datetime"]= pd.to_datetime(df["datetime"], unit='ms')
df.set_index('datetime', inplace=True)
#print(df)

# btc_ohlcv 에 timeframe을 1d 그리고 limit를 걸어둔다면 특정 개수만 조회할 수 있다.

#이더리움 호가 보기
orderbook = binance.fetch_order_book('ETH/USDT')
#print("asks" , orderbook['asks'])
#print("bids" , orderbook['bids'])

with open("api.txt") as f:
    lines = f.readlines()
    api_key = lines[0].strip()
    secret_key = lines[1].strip()
    
    balance = binance.fetch_balance()
    print(balance["USDT"])