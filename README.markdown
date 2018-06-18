SalutemWeb - repository to store plugins for Liferay Portal 6.2 ga6 created for EPS project with topic "Smart Healthcare in Smart Cities"



## Quick Start

In the [liferay-plugins](https://github.com/liferay/liferay-plugins) repository,
plugins are laid out in a software development kit (SDK) -- the Liferay Plugins
SDK. All Liferay plugin types, including portlets, themes, layout templates,
hooks, and EXT plugins, can be created and maintained in the SDK. [The Plugins
SDK](http://www.liferay.com/documentation/liferay-portal/6.1/development/-/ai/the-plugins-s-3)
chapter of Liferay's [Development
Guide](http://www.liferay.com/documentation/liferay-portal/6.1/development)
explains how to create, build, and deploy your plugins. Follow the instructions
in this section to build and deploy any of the existing SDK plugins quickly.

For demonstration purposes, let's pretend your user name is *joe* and you have a
Liferay instance bundled with Apache Tomcat running in your `/home/joe/`
directory.

1. Fork the [liferay-plugins](https://github.com/liferay/liferay-plugins)
repository.

2. Clone your fork of the repository.
3. Create a `build.${username}.properties` file in the root directory of your
liferay-plugins repository clone. Be sure to replace `${username}` with your
user name.

		/home/joe/liferay-plugins/build.joe.properties

	Note, to determine your user name, execute `echo %USERNAME%` on Windows or
	`whoami` on Unix/Linux.

4. In your `build.${username}.properties` file, specify the
`app.server.parent.dir` property set to the parent path of your app server.

    	app.server.parent.dir=/home/joe/liferay-portal-6.1.1-ga2

	Use your `build.${username}.properties` file to specify any additional
	properties you wish to override from the base `build.properties` file; do
	not modify the base file.

5. Navigate to the directory of a plugin (e.g. *Sample JSP Portlet*) and deploy
it using Ant.

		cd /home/joe/liferay-plugins/portlets/sample-jsp-portlet
		ant deploy

	The plugin compiles, its WAR file is built to the plugin's `dist` directory,
	the WAR file is copied to your Liferay *Hot Deploy* directory, and the
	plugin is deployed immediately. It's just that easy!

There are many other options for developing new Liferay plugins using the
Plugins SDK. Consult the [Liferay Development
Guide](http://www.liferay.com/documentation/liferay-portal/6.1/development) for
indispensable explanations, examples, and reference material on the Liferay
Plugins SDK and surrounding technologies.

Also, check out Liferay IDE. The [Liferay IDE
project](http://www.liferay.com/community/liferay-projects/liferay-ide) provides
an Eclipse-based Liferay development environment to help you build and maintain
Liferay projects easily.

Finally, consider using Maven to build Liferay Plugins. For excellent overviews
of Maven support for Liferay, check out [Mika Koivisto's
presentation](http://www.slideshare.net/koivimik/developing-liferay-plugins-with-maven)
and [Getting Started with Liferay Maven
SDK](http://www.liferay.com/web/mika.koivisto/blog/-/blogs/12322618).

