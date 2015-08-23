(ns brainstroming.info)

(defn askBase
  "ask base infomation. e.g. name, topic, porpose"
  []
  (println "What's' your name?")
  (def Name (read-line))
  (println "Hello" Name ", What's your topic?")
  (def Topic (read-line))
  (println "Okeydokey, Let's begin!"))
