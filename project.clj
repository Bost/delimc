(defproject delimc :lein-v
  :description "Delimited Continuations for Clojure"
  :dependencies
  [[org.clojure/clojure "1.10.0"]
   ]
  :plugins
  [
   ;; autorecompile changed java files
   [lein-virgil "0.1.9"]

   ;; drive leiningen project version from git
   [com.roomkey/lein-v "7.0.0"]
   ]
  )
