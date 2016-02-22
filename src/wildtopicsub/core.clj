(ns wildtopicsub.core
  (:require [immutant.messaging :as msg])
  (:gen-class))


(defonce tpc "topic1")

(defonce subscription-name-1 "sub-name-1")

(defn- listener 
  "A simple message listener"
  [m]
  (println "Subscriber rcv'ed: " (pr-str m)))


(defn -main
  [& args]

  (println)
  (println "Subscribing for messages from Topic: " tpc)
  (println)

  (msg/subscribe (msg/topic tpc) subscription-name-1 listener)

  (println)
  (println)
)


