(ns remix.demo.page
  (:require
    [reagent.core :as r]))

(defn demo
  []
  [:div
   [:h1 "It Works"]])

(def demo-page (r/reactify-component demo))

