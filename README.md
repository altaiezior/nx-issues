# Nx Issues Repro

A collection of reproduction cases for Nx issues.

## Optimized Project Structure

This project uses **pnpm workspaces** to minimize disk space while allowing each reproduction case to maintain its own specific dependency versions.

### How to use

1. **Install all dependencies:**
   Run the following command in the project root:
   ```bash
   pnpm install
   ```
   pnpm will automatically install dependencies for all `issue-*` directories and link them efficiently.

2. **Run an individual reproducer:**
   Navigate into the issue directory and run the nx command:
   ```bash
   cd issue-XXXXX
   ./node_modules/.bin/nx <command>
   ```

### Adding a new issue

1. Create a new directory starting with `issue-`.
2. Create a `package.json` with the required versions of `nx` and other plugins.
3. Run `pnpm install` in the root.
4. pnpm will automatically pick up the new directory and install its dependencies.
